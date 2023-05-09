package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex07MaiorOuMenor {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//IMPRIMIR O MAIOR E O MENOR NÚMERO
		System.out.println("MAIOR E MENOR");
		System.out.println("Digite um número: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite outro número: ");
		double num2 = scan.nextDouble();
		System.out.println("Digite mais um número: ");
		double num3 = scan.nextDouble();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("O MAIOR número digitado foi: " +  num1);			
		}
		else if (num2 >= num3 && num2 >= num1) {
			System.out.println("O MAIOR número digitado foi: " +  num2);			
		}
		else if (num3 >= num1 && num3 >= num2) {
			System.out.println("O MAIOR número digitado foi: " +  num3);			
		}
		
		if(num1 <= num2 && num1 <= num3) {
			System.out.println("O MENOR número digitado foi: " +  num1);			
		}
		else if (num2 <= num3 && num2 <= num1) {
			System.out.println("O MENOR número digitado foi: " +  num2);			
		}
		else if (num3 <= num1 && num3 <= num2) {
			System.out.println("O MENOR número digitado foi: " +  num3);			
		}

	}

}
