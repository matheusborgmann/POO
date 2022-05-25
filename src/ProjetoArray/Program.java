package ProjetoArray;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numero = new int [6];

        for(int i = 0; i < 6; i++) {
            System.out.println("Digite um número: ");
            numero[i] = sc.nextInt();
        }

        for(int i = 0; i > 0; i++) {
            System.out.println(numero[i]);
        }
    }
}
