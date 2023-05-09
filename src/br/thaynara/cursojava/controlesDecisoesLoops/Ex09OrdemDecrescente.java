package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex09OrdemDecrescente {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//CLASSIFICANDO EM ORDEM DECRESCENTE
		System.out.println("VERIFICANDO QUAL MAIOR NÚMERO");
		System.out.println("Informe um número: ");
		int num1 = scan.nextInt();
		System.out.println("Informe outro número: ");
		int num2 = scan.nextInt();
		System.out.println("Informe mais um número: ");
		int num3 = scan.nextInt();
		
		if(num1 < num2 && num2 < num3) {
			System.out.println(num1 + "-" + num2 + "-" + num3);			
		}
		else if (num1 < num3 && num3 < num2) {
			System.out.println(num1 + "-" + num3 + "-" + num2);			
		}
		else if (num2 < num1 && num1 < num3) {
			System.out.println(num2 + "-" + num1 + "-" + num3);				
		}
		else if (num2 < num3 && num3 < num1) {
			System.out.println(num2 + "-" + num3 + "-" + num1);			
		}
		else if (num3 < num1 && num1 < num2) {
			System.out.println(num3 + "-" + num1 + "-" + num2);	
		}
		else if (num3 < num2 && num2 < num1) {
			System.out.println(num3 + "-" + num2 + "-" + num1);			
		}
	}

}
