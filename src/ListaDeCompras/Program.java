package ListaDeCompras;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ListaDeCompras l1 = new ListaDeCompras();
		
		int op;
		
		do {
			System.out.println("DIGITE");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Visualizar Produtos");
			System.out.println("3 - Ver quantidade de Produtos");
			System.out.println("4 - Apagar todos os Produtos");
			System.out.println("5 - Ver total de compras");
			System.out.println("0 - Sair");
			op = sc.nextInt();
			switch(op) {
			case 1:
				Produto p1 = new Produto();
				System.out.println("Digite o nome do produto: ");
				sc.nextLine();
				p1.setNome(sc.nextLine());
				do {
					System.out.println("Digite a quantidade: ");
					p1.setQuantidade(sc.nextInt());
					if(p1.getQuantidade() <= 0) {
						System.out.println("Erro! Quantidade invalida.");
					}
				}while(p1.getQuantidade()<=0);
				
				do {
					System.out.println("Digite o valor unitario: ");
					p1.setValorUnitario(sc.nextDouble());
					if(p1.getValorUnitario() <= 0) {
						System.out.println("Erro! Quantidade invalida.");
					}
				}while(p1.getValorUnitario() <= 0);
				
				l1.adicionarProduto(p1);
				System.out.println("Cadastrar com sucesso!");
				break;
			case 2:
				if(l1.getLista().isEmpty()) {
					System.out.println("N�o h� produtos");
				}else {
					System.out.println(l1);
				}
				break;
			case 3:
				System.out.println("Total de cadastros: " + l1.obterQuantidadeDeProdutos());
				break;
			case 4:
				if(l1.getLista().isEmpty()) {
					System.out.println("N�o h� produtos para excluir.");
				}else {
					int confirma;
					System.out.println("Tem certeza que deseja EXCLUIR TUDO?\n1-SIM\n2-NAO");
					confirma = sc.nextInt();
					if(confirma == 1) {
						l1.apagarTudo();
						System.out.println("Produtos excluidos com sucesso");
					}else {
						System.out.println("Opcao cancelada.");
					}
				}
				break;
			case 5:
				System.out.println("Total da lista R$ " + l1.calcularTotalDaLista());
				break;
			case 0:
				System.out.println("Sistema encerrado.");
				break;
			default:
				System.out.println("Opcao inv�lida.");
			}
		}while(op!=0);
	}

}
