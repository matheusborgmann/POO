package ProjetoEstruturaCondicional;

import java.util.Scanner;

public class Program {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Numero n1 = new Numero();
		
		System.out.println("Digite um N�mero: ");
		n1.setDia(sc.nextInt());
		
		System.out.println("***RESPOSTA***");
		String dia = n1.verDiaDaSemana();
		System.out.println(dia);
				
		sc.close();
	}
}
