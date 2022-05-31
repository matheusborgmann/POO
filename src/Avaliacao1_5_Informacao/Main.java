package Avaliacao1_5_Informacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Editora e1 = new Editora();

        int op;

        do {
            System.out.println("\nBem vindo a bookstore!\npor favor digite sua operacao:\n ");
            System.out.println("1 - Registrar uma nova editora");
            System.out.println("2 - Registrar novo livro");
            System.out.println("3 - Visualizar todos livros");
            System.out.println("4 - Visualizar livros por autor");
            System.out.println("5 - Visualizar livro por editora"); //arrumar
            System.out.println("6 - Visualizar livro por ano que foi lancado");
            System.out.println("7 - Procurar livro por titulo");
            System.out.println("8 - Remover um livro");
            System.out.println("0 - Sair\n");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    Editora e2 = new Editora();

                    System.out.println("Digite o nome da editora: ");
                    sc.nextLine();
                    e2.setNome(sc.nextLine());
                    System.out.println("Digite o email da editora: ");
                    e2.setEmail(sc.nextLine());
                    System.out.println("Digite a id da editora");
                    e2.setId(sc.nextLong());
                    e1.armazenarEditoras(e2);
                    break;
                case 2:
                    Livro l1 = new Livro();
                    System.out.println("Digite o titulo do livro: ");
                    sc.nextLine();
                    l1.setTitulo(sc.nextLine());
                    System.out.println("Digite o autor do livro: ");
                    l1.setAutor(sc.nextLine());
                    System.out.println("Digite o ano que o livro foi publicado: ");
                    l1.setAno(sc.nextInt());
                    System.out.println("Digite a id da editora do livro: ");
                    l1.setIdEditora(sc.nextInt());
                    e1.armazenarLivro(l1);
                    break;
                case 3:
                    e1.imprimirLivros();
                    break;
                case 4:
                    String Autor;
                    System.out.println("Digite o nome do autor: ");
                    sc.nextLine();
                    Autor = sc.nextLine();
                    e1.verPorAutor(Autor);
                    break;
                case 5:
                    int editora;
                    System.out.println("Editoras Disponiveis: ");
                    e1.imprimirEditoras();
                    System.out.println("\nDigite o id da editora: ");
                    editora = sc.nextInt();
                    e1.verPorEditora(editora);
                    break;
                case 6:
                    System.out.println("Escreva o ano dos livros que deseja procurar: ");
                    e1.verPorAnos(sc.nextInt());
                    break;
                case 7:
                    String titulo;
                    System.out.println("Digite o nome do livro: ");
                    sc.nextLine();
                    titulo = sc.nextLine();
                    e1.imprimeLivro(titulo);
                    break;
                case 8:
                    String title;
                    System.out.println("Digite o nome do livro que deseja remover: ");
                    sc.nextLine();
                    title = sc.nextLine();
                    e1.removeLivro(title);
                    break;
                case 0:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while (op != 0);
        sc.close();
    }
}
