package Avaliacao1_4_Artistas;

import Avaliacao1_1_Agenda.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sistema s1 = new Sistema();

        int op = -1;

        do {
            System.out.println("\n1 - Registrar artista");
            System.out.println("2 - Buscar artista por nome");
            System.out.println("0 - Sair\n");
            op = sc.nextInt();
            switch (op){
                case 1:
                    Artistas a1 = new Artistas();
                    System.out.println("Digite o nome do artista: ");
                    sc.nextLine();
                    a1.setNome(sc.nextLine());
                    System.out.println("Digite o genero musical do artista: ");

                    a1.setGenero(sc.nextLine());
                    System.out.println("Digite o instrumento utilizado pelo artista: ");

                    a1.setInstrumento(sc.nextLine());
                    System.out.println("Digite a quantidade de albuns do artista: ");

                    a1.setAlbuns(sc.nextInt());

                    s1.armazenarPessoa(a1);
                    break;
                case 2:
                    String nome;
                    System.out.println("Digite o nome do artista que deseja buscar: ");
                    sc.nextLine();
                    nome = sc.nextLine();
                    s1.buscarPessoa(nome);
                    break;
                case 0:
                    System.out.println("desligando...");
                    break;
                default:
                    System.out.println("\nopção inválida");
                    break;
            }

        }while (op != 0);

        sc.close();
    }
}
