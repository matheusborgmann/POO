package ProjetoTreinoNatacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Treino t1 = new Treino();

        System.out.println("Informe o nome do Atletla: ");
        t1.setNome(sc.next());

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe a marca " + i + " : ");
            t1.amarzenarMarcas(i, sc.nextDouble());
        }
        System.out.println(t1);
        double media = t1.calcularMediaDeMarcas();
        double maior = t1.obterMaiorMarca();

        System.out.println("Média de marcas: " + media);
        System.out.println("Maior marcas: " + maior);

        sc.close();
    }
}
