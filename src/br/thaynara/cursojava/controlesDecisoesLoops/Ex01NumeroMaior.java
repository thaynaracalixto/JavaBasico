package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex01NumeroMaior {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//IMPRIMIR O MAIOR NÚMERO
		System.out.println("VERIFICANDO QUAL MAIOR NÚMERO");
		System.out.println("Digite um número: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite outro número: ");
		double num2 = scan.nextDouble();
		//double res = Math.max(num1, num2);
		double res = 0;
		
		if(num1 >= num2) {
			res = num1;
			System.out.println("O maior número digitado é:" + res);
		}
		else {
			System.out.println("O maior número digitado é:" + num2);
		}
	}

}
