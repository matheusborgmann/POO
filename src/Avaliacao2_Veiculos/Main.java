package Avaliacao2_Veiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Automovel auto = new Automovel();
        Automovel auto2 = new Automovel();
        Aviao aviao = new Aviao();
        Aviao aviao2 = new Aviao();
        Barco barco = new Barco();
        Barco barco2 = new Barco();

        int opc, opt;
        do {

            System.out.println("""
                    1 - Registrar um novo veiculo
                    2 - Interagir com um veiculo
                    0 - Sair""");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    do {
                        System.out.println("""
                                1 - Registar automovel
                                2 - Registrar aviao
                                3 - Registrar barco
                                0 - Retornar para o menu principal""");
                        opt = sc.nextInt();
                        switch (opt) {
                            case 1:
                                Fabricante car = new Fabricante();
                                System.out.println("Digite o nome do automovel: ");
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
                        switch (opt) {
                            case 1:
                                do {
                                    System.out.println("""
                                            1 - Acelerar automovel
                                            2 - Abrir porta-malas
                                            3 - Mostrar detalhes do automovel
                                            0 - Retornar para o menu principal""");
                                    opt = sc.nextInt();
                                    switch (opt) {
                                        case 1:
                                            auto.acelerar();
                                            break;
                                        case 2:
                                            auto.abrirPortaMalas();
                                            break;
                                        case 3:
                                            auto.mostrarDetalhes();
                                            break;
                                        case 0:
                                            System.out.println("retornando...");
                                            break;
                                        default:
                                            System.out.println("Opcao invalida");
                                            break;
                                    }
                                } while (opt != 0);

                                break;
                            case 2:
                                do {
                                    System.out.println("1 - Acelerar aviao" +
                                            "\n2 - Decolar aviao" +
                                            "\n3 - Pousar aviao" +
                                            "\n4 - Mostrar detalhes do aviao" +
                                            "\n0 - Retornar para o menu principal");
                                    opt = sc.nextInt();
                                    switch (opt) {
                                        case 1:
                                            aviao.acelerar();
                                            break;
                                        case 2:
                                            aviao.decolar();
                                            break;
                                        case 3:
                                            aviao.pousar();
                                            break;
                                        case 4:
                                            aviao.mostrarDetalhes();
                                            break;
                                        case 0:
                                            System.out.println("retornando...");
                                            break;
                                        default:
                                            System.out.println("Opcao invalida");
                                            break;
                                    }
                                } while (opt != 0);

                                break;
                            case 3:
                                do {
                                    System.out.println("1 - Icar velas" +
                                            "\n2 - Recolher velas" +
                                            "\n3 - Acelerar barco" +
                                            "\n4 - Mostrar detalhes do barco" +
                                            "\n0 - Retornar para o menu principal");
                                    opt = sc.nextInt();
                                    switch (opt) {
                                        case 1:
                                            barco.icarVelas();
                                            break;
                                        case 2:
                                            barco.recolherVelas();
                                            break;
                                        case 3:
                                            barco.acelerar();
                                            break;
                                        case 4:
                                            barco.mostrarDetalhes();
                                            break;
                                        case 0:
                                            System.out.println("retornando...");
                                            break;
                                        default:
                                            System.out.println("Opcao invalida");
                                            break;
                                    }
                                } while (opt != 0);

                                break;
                            case 0:
                                System.out.println("Retornando ao menu principal....");
                                break;
                            default:
                                System.out.println("Opcao invalida");
                                break;
                        }
                    } while (opt != 0);
                    break;
                case 0:
                    System.out.println("Desligando sistema...");
                    break;
                default:
                    System.out.println("Opcao Invalida");
                    break;
            }
        } while (opc != 0);

        sc.close();
    }
}