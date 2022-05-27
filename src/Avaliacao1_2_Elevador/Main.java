package Avaliacao1_2_Elevador;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Elevador e1 = new Elevador();
        int op;
        do {
            System.out.println("\nDiga o que deseja fazer: ");
            System.out.println("1 - Inicializa");
            System.out.println("2 - Entra pessoa");
            System.out.println("3 - Sai pessoa");
            System.out.println("4 - Sobe andar");
            System.out.println("5 - Desce andar");
            System.out.println("0 - Finalizar\n");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    e1.ElevadorNovo();
                    System.out.println("Digite a capacidade máxima de pessoas no elevador: ");
                    e1.setCapElevador(sc.nextInt());
                    System.out.println("Digite a quantidade de andares do prédio: ");
                    e1.setCapAndar(sc.nextInt());
                    break;
                case 2:
                    e1.entra();
                    break;
                case 3:
                    e1.removePerson();
                    break;
                case 4:
                    System.out.println("Para qual andar deseja subir?");
                    e1.upFloor(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Para qual andar deseja descer?");
                    e1.downFloor(sc.nextInt());
                    break;
                case 0:
                    System.out.println("Finalizando!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (op != 0);
        sc.close();
    }
}