package ProjetoConstructorsProduto;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p = new Product();
        System.out.println("Nome: ");
        String nome = sc.next();

        System.out.println("Preço: ");
        double preco = sc.nextDouble();

        System.out.println("Quantidade: ");
        int quantidade = sc.nextInt();

        Product produto = new Product(nome, preco, quantidade);

        System.out.println("Numero de produto adicionado: ");
        quantidade = sc.nextInt();
        produto.addProdutos(quantidade);

        System.out.println("Numero de produto removido: ");
        quantidade = sc.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println("Saida: " +produto);

        System.out.println(p);

        sc.close();
    }
}
