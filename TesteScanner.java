package aularevisao;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int valor1 = leitor.nextInt();
		
		System.out.println("Digite outro numero");
		int valor2 = leitor.nextInt();
		
		System.out.println("A soma de " + valor1 + " e " +"é igual a " + (valor1 + valor2));

		leitor.close();
	}

}
