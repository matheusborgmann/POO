/*
    NÃO CONSEGUI FAZER A 2 A TEMPO :C
*/


package Avaliacao2_AcademiaDeGinastica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Turma> t = new ArrayList<>();
        int op;

        do {
            System.out.println("""
                    1 - Visualizar turmas
                    2 - Registrar Turma
                    3 - Registrar instrutor para uma turma
                    0 - Fechar sistema.
                    """);
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println(t);
                    break;
                case 2:
                    String nome, horAula, durAula, dataIni, dataFim, atividade;
                    int numAlunos;
                    System.out.println("Nome:");
                    sc.nextLine();
                    nome = sc.nextLine();
                    System.out.println("Numero de alunos:");
                    numAlunos = sc.nextInt();
                    System.out.println("Horario da aula:");
                    sc.nextLine();
                    horAula= sc.nextLine();
                    System.out.println("Duração da aula");
                    durAula = sc.nextLine();
                    System.out.println("Data inicial:");
                    dataIni = sc.nextLine();
                    System.out.println("Data fim:");
                    dataFim = sc.nextLine();
                    System.out.println("Tipo de atividade:");
                    atividade = sc.nextLine();

                    t.add(new Turma(nome, numAlunos, horAula, durAula, dataIni, dataFim, atividade));
                    break;
                case 3:
                    Instrutor i = new Instrutor();
                    System.out.println("Nome do instrutor");
                    i.setNome(sc.nextLine());
                    System.out.println("RG do instrutor:");
                    i.setRg(sc.nextLine());
                    System.out.println("Data de nascimento do instrutor:");
                    i.setDataNasc(sc.nextLine());
                    System.out.println("Titulação do instrutor:");
                    i.setTitu(sc.nextLine());
                    System.out.println("Telefone do instrutor:");
                    i.setTel(sc.nextLine());
                    t.add(new Turma(i));
                    break;
                case 0:
                    System.out.println("0");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (op != 0);
    }
}
