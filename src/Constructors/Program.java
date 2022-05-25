package Constructors;

import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a cor inicial do time: ");
		String cor = sc.next();
		
		// o m�todo construtor � acionado quando criamos uma instancia do objeto 
		// o m�todo construtor, apesar de n�o retornar nada, n�o utiliza a palavra void 
		Tricolor t1 = new Tricolor(cor);
	
		
		System.out.println(t1);
		
		sc.close();
	}

}
