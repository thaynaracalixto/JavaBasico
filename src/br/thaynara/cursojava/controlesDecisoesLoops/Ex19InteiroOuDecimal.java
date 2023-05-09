package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex19InteiroOuDecimal {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//VERIFICAR SE O NÚMERO É INTEIRO OU DECIMAL
		System.out.println("INTEIRO OU DECIMAL?");
		System.out.println("Informe um número: ");
		double num = scan.nextDouble();
		
		if(num % 1 == 0) {
			System.out.println("INTEIRO");
		}
		else {
			System.out.println("DECIMAL");
		}
		
		

	}

}
