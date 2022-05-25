package ProjetoSaidaDeDados;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Data d1 = new Data();
		
		System.out.println("Informe o dia: ");
		d1.setDia(sc.nextInt());
		
		System.out.println("Informe o m�s: ");
		d1.setMes(sc.nextInt());
		
		System.out.println("Informe o ano: ");
		d1.setAno(sc.nextInt());
		
		
		System.out.println("*******VISUALIZANDO A DATA*******");

		System.out.println(d1);
	
		sc.close();
	}
	
}			