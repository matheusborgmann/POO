package Avaliacao1_1_Agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Agenda a1 = new Agenda();

        int op = -1;
        int limite = 0;

        do {
            System.out.println("\nSelecione a opcao: ");
            System.out.println("\n1 - Armazenar pessoa");
            System.out.println("2 - Buscar Pessoa");
            System.out.println("3 - Imprime Agenda");
            System.out.println("4 - Imprime Pessoa");
            System.out.println("5 - Remove Pessoa");
            System.out.println("0 - Desligar programa\n");
            op = sc.nextInt();
            switch (op) {
                case 0:
                    System.out.println("Terminando execução do programa....");
                    break;
                case 1:
                    if (limite < 10) {
                        Pessoa p1 = new Pessoa();
                        System.out.println("Digite o nome da pessoa: ");
                        sc.nextLine();
                        p1.setNome(sc.nextLine());

                        do {
                            System.out.println("Digite a altura: ");
                            p1.setAltura(sc.nextFloat());
                            if (p1.getAltura() <= 0) {
                                System.out.println("Erro! Altura invalida!");
                            }
                        } while (p1.getAltura() <= 0);

                        do {
                            System.out.println("Digite a idade: ");
                            p1.setIdade(sc.nextInt());
                            if (p1.getIdade() <= 0) {
                                System.out.println("Erro! Idade invalida!");
                            }
                        } while (p1.getIdade() <= 0);

                        a1.armazenarPessoa(p1);
                        limite++;
                        System.out.println("Pessoa armazenada com sucesso!");
                    } else {
                        System.out.println("Agenda cheia!");
                    }
                    break;
                case 2:
                    String pessoa;
                    System.out.println("Insira o nome da pessoa da qual deseja buscar: ");
                    sc.nextLine();
                    pessoa = sc.nextLine();
                    a1.buscarPessoa(pessoa);
                    break;
                case 3:
                    if (a1.getAgenda().isEmpty()) {
                        System.out.println("Não há contatos");
                    } else {
                        System.out.println(a1);
                    }
                    break;
                case 4:
                    int index;
                    System.out.println("Digite a posição da pessoa que deseja imprimir");
                    index = sc.nextInt();
                    a1.imprimePessoa(index);
                    break;
                case 5:
                    String Pessoa;
                    System.out.println("Digite o nome da pessoa");
                    sc.nextLine();
                    Pessoa = sc.nextLine();
                    a1.removePessoa(Pessoa);
                    System.out.println("Pessoa removida com sucesso");
                    break;
            }

        } while (op != 0);

        sc.close();
    }
}
