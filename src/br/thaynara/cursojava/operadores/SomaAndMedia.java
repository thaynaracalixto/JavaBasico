package br.thaynara.cursojava.operadores;

import java.util.Scanner;

public class SomaAndMedia {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//EXERCICIO 2
		System.out.println("IMPRIMINDO UM NÚMERO\n");
		System.out.println("Digite um número: ");
		int num = scan.nextInt();
		System.out.println("O número informado foi: " + num);
		
		//EXERCICIO 3
		System.out.println("SOMANDO DOIS NÚMEROS\n");
		System.out.println("Digite um número: ");
		int num1 = scan.nextInt();
		System.out.println("Digite outro número: ");
		int num2 = scan.nextInt();
		int res = num1 + num2;
		System.out.println("A soma dos números digitados é: " + res);
		
		//EXERCICIO 4
		System.out.println("CALCULANDO A MÉDIA\n");
		System.out.println("Digite a Primeira nota: ");
		int nota1 = scan.nextInt();
		System.out.println("Digite a Segunda nota: ");
		int nota2 = scan.nextInt();
		System.out.println("Digite a Terceira nota: ");
		int nota3 = scan.nextInt();
		System.out.println("Digite a quarta nota: ");
		int nota4 = scan.nextInt();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("A média das notas são: " + media);
		
			
		
	}
	
}
