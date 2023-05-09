package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex18ParOuImpar {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//VERIFICAR SE UM NÚMERO INTEIRO É PAR OU IMPAR
		System.out.println("PAR OU IMPAR?");
		System.out.println("Digite um número: ");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("É PAR");			
		}
		else {
			System.out.println("É IMPAR");
		}

	}

}
