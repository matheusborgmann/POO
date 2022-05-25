package ProjetoOperadoresLogicos;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//(new) construc�o (Contrutor)
		Numero n1 = new Numero();
		
		System.out.println("Digite um N�mero: ");
		n1.setValor(sc.nextInt());

		System.out.println(n1.verificarNumero());

		sc.close();
	}
	
}
