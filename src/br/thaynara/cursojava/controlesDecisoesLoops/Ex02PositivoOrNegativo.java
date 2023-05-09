package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex02PositivoOrNegativo {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//VERIFICA SE É POSITIVO OU NEGATIVO
		System.out.println("POSITIVO OU NEGATIVO?");
		System.out.println("Digite um número: ");
		double num = scan.nextDouble();
		
		if (num < 0) {
			System.out.println("O número digitado é Negativo.");
		}
		else {
			System.out.println("O número digitado é Positivo");
		}

	}

}
