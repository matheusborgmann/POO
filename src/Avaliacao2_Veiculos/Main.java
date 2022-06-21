package Avaliacao2_Veiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Automovel auto = new Automovel();
        Aviao aviao = new Aviao();
        Barco barco = new Barco();

        int opc, opt;
        do {

            System.out.println("""
                    1 - registrar um novo veiculo
                    2 - interagir com um veiculo
                    0 - sair""");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    do {
                        System.out.println("""
                                1 registar automovel
                                2 registrar aviao
                                3 registrar barco
                                0 - retornar para o menu principal""");
                        opt = sc.nextInt();
                        switch (opt) {
                            case 1:
                                System.out.println("Digite o nome do veiculo: ");
                                sc.nextLine();
                                auto.setNome(sc.nextLine());
                                System.out.println("Digite o ano de fabricacao do automovel: ");
                                auto.setAnoFabricacao(sc.nextInt());
                                System.out.println("Qual o nome da empresa fabricante: ");
                                sc.nextLine();
                                auto.setNomeFab(sc.nextLine());
                                System.out.println("Pais de origem da " + auto.getNomeFab() + ":");
                                auto.setPaisDeOrig(sc.nextLine());
                                System.out.println("Digite a capacidade de pessoas do automovel: ");
                                auto.setCapacidade(sc.nextInt());
                                System.out.println("Qual o diametro da roda: ");
                                auto.setDiametroRoda(sc.nextInt());
                                auto.mostrarDetalhes();
                                break;
                            case 2:
                                System.out.println("Digite o nome do veiculo: ");
                                sc.nextLine();
                                aviao.setNome(sc.nextLine());
                                System.out.println("Digite o ano de fabricacao do aviao: ");
                                aviao.setAnoFabricacao(sc.nextInt());
                                System.out.println("Qual o nome da empresa fabricante: ");
                                sc.nextLine();
                                aviao.setNomeFab(sc.nextLine());
                                System.out.println("Pais de origem da " + aviao.getNomeFab() + ":");
                                aviao.setPaisDeOrig(sc.nextLine());
                                System.out.println("Digite a capacidade de pessoas do aviao: ");
                                aviao.setCapacidade(sc.nextInt());
                                System.out.println("Numero de turbinas: ");
                                aviao.setNumTurbinas(sc.nextInt());
                                aviao.mostrarDetalhes();

                                break;
                            case 3:
                                System.out.println("Digite o nome do veiculo: ");
                                sc.nextLine();
                                barco.setNome(sc.nextLine());
                                System.out.println("Digite o ano de fabricacao do barco: ");
                                barco.setAnoFabricacao(sc.nextInt());
                                System.out.println("Qual o nome da empresa fabricante: ");
                                sc.nextLine();
                                barco.setNomeFab(sc.nextLine());
                                System.out.println("Pais de origem da " + barco.getNomeFab() + ":");
                                barco.setPaisDeOrig(sc.nextLine());
                                System.out.println("Digite a capacidade de pessoas do barco: ");
                                barco.setCapacidade(sc.nextInt());
                                System.out.println("Numero de velas: ");
                                barco.setNumVelas(sc.nextInt());
                                barco.mostrarDetalhes();
                                break;
                            case 0:
                                System.out.println("Retornando ao menu...");
                                break;
                            default:
                                System.out.println("Opcao invalida");
                                break;
                        }
                    } while (opt != 0);
                    break;
                case 2:
                    do {
                        System.out.println("""
                                1 - Automovel
                                2 - Aviao
                                3 - Barco
                                0 - retornar ao menu principal""");
                        opt = sc.nextInt();
                        switch (opt){
                            case 1:
                                auto.acelerar();
                                auto.abrirPortaMalas();
                                break;
                            case 2:
                                aviao.acelerar();
                                aviao.decolar();
                                aviao.pousar();
                                aviao.acelerar();
                                break;
                            case 3:
                                barco.icarVelas();
                                barco.recolherVelas();
                                barco.acelerar();
                                break;
                            case 0:
                                System.out.println("Retornando ao menu principal....");
                                break;
                            default:
                                System.out.println("Opcao invalida");
                                break;
                        }
                    }while (opt != 0);
                    break;
                case 0:
                    System.out.println("Desligando sistema...");
                    break;
                default:
                    System.out.println("Opcao Invalida");
                    break;
            }
        }while (opc != 0);

        sc.close();
    }
}