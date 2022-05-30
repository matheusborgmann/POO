package Avaliacao1_3_Studant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;

        float n1 = 0, n2 = 0, n3 = 0;

        Student s1 = new Student(n1, n2, n3);

        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();

        do {
            System.out.println(nome + ", digite a nota do primeiro trimestre: ");
            n1 = sc.nextFloat();
            if (n1 >= 31 || n1 < 0)
                System.out.println("As notas do primeiro trimestre variam entre 0 e 30. Digite novamente: ");
        } while (n1 < 0 || n1 > 30);
        s1.setNota1(n1);

        do {
            System.out.println(nome + ", digite a nota do segundo trimestre: ");
            n2 = sc.nextFloat();
            if (n2 >= 36 || n2 < 0)
                System.out.println("As notas do segundo trimestre variam entre 0 e 35. Digite novamente: ");
        } while (n2 < 0 || n2 > 35);
        s1.setNota2(n2);

        do {
            System.out.println(nome + ", digite a nota do terceiro trimestre: ");
            n3 = sc.nextFloat();
            if (n3 >= 36 || n3 < 0)
                System.out.println("As notas do terceiro trimestre variam entre 0 e 35. Digite novamente: ");
        } while (n3 < 0 || n3 > 35);
        s1.setNota3(n3);

        float notaFinal = s1.notaFinal();
        System.out.println("A sua nota final foi:" + notaFinal);
        if (notaFinal >= 60) {
            System.out.println("PASS!");
        } else {
            System.out.println("FAILED!\nFaltaram: " + (notaFinal - 60) * -1 + " pontos para você ser aprovado.");
        }
        sc.close();
    }
}
