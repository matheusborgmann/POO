package Avaliacao1_6_Cadastro;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Scanner scString = new Scanner(System.in);

        char resp;

        Pessoa p1 = new Pessoa();
        Endereco e1 = new Endereco();

        System.out.println("Digite o nome da pessoa: ");
        p1.setNome(sc.nextLine());

        do {
            System.out.println("Digite a idade da pessoa: ");
            p1.setIdade(sc.nextInt());
            if (p1.getIdade() <= 0) {
                System.out.println("Erro! Idade Inválida!");
            }
        } while (p1.getIdade() <= 0);

        do {
            System.out.println("Digite o sexo da pessoa: (M/F)");
            p1.setSexo(sc.next().charAt(0));
            if (p1.getSexo() != 'M' && p1.getSexo() != 'F') {
                System.out.println("Erro! Sexo Inválido!");
            }
        } while (p1.getSexo() != 'M' && p1.getSexo() != 'F');

        System.out.println("\nDigite o endereço: ");
        e1.setLogradouro(scString.nextLine());
        System.out.println("O endereço possui complemento? (S/N)");
        resp = scString.nextLine().charAt(0);

        if (resp == 'S' || resp == 's') {
            System.out.println("Digite o complemento do endereço: ");
            e1.setComplemento(scString.nextLine());
        } else {
            e1.setComplemento("");
        }

        System.out.println("Digite o número do endereço: ");
        e1.setNumero(sc.nextInt());
        System.out.println("Digite o CEP do endereço: ");
        e1.setCep(scString.nextLine());
        p1.setEnd(e1);
        System.out.println("\n Dados do contato: \n" + p1);

        sc.close();
        scString.close();
    }
}
