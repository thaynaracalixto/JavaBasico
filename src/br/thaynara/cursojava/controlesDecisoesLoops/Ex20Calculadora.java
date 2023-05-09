package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex20Calculadora {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//FAZ OPERAÇÕES MATEMATICAS E RETORNA SE É:
		//POSITIVO OU NEGATIVO
		//PAR OU IMPAR
		//INTEIRO OU DECIMAL		
		System.out.println("CALCULADORA");
		System.out.println("Informe um número: ");
		int a = scan.nextInt();
		System.out.println("Informe um número: ");
		int b = scan.nextInt();
		System.out.println("ESCOLHA UMA OPÇÃO");
		System.out.println("1 - SOMAR\n"+
				"2 - SUBTRAIR\n"+
				"3 - MULTIPLICAÇÃO\n" +
				"4 - DIVISÃO");
		int opcao = scan.nextInt();
		int soma = 0;
		int subtracao = 0;
		double multiplicacao = 0;
		double divisao = 0;		
		
		if(opcao == 1) {
			soma = a + b;
			System.out.println("Resultado: " + soma);	
			if(soma%2 == 0) {
				System.out.println("PAR");
			}
			else {
				System.out.println("IMPAR");
			}
			if(soma >= 0) {
				System.out.println("POSITIVO");
			}
			else {
				System.out.println("NEGATIVO");
			}
			if(soma%1 == 0) {
				System.out.println("INTEIRO");
			}
			else {
				System.out.println("DECIMAL");
			}
		} 
		else if(opcao == 2) {
			subtracao = a - b;
			System.out.println("Resultado: " + subtracao);
			if(subtracao%2 == 0) {
				System.out.println("PAR");
			}
			else {
				System.out.println("IMPAR");
			}
			if(subtracao >= 0) {
				System.out.println("POSITIVO");
			}
			else {
				System.out.println("NEGATIVO");
			}
			if(subtracao%1 == 0) {
				System.out.println("INTEIRO");
			}
			else {
				System.out.println("DECIMAL");
			}
		}
		else if(opcao == 3) {
			multiplicacao = a * b;
			System.out.println("Resultado: " + multiplicacao);
			if(multiplicacao%2 == 0) {
				System.out.println("PAR");
			}
			else {
				System.out.println("IMPAR");
			}
			if(multiplicacao >= 0) {
				System.out.println("POSITIVO");
			}
			else {
				System.out.println("NEGATIVO");
			}
			if(multiplicacao%1 == 0) {
				System.out.println("INTEIRO");
			}
			else {
				System.out.println("DECIMAL");
			}
		}
		else if(opcao == 4) {
			divisao = a / b;
			System.out.println("Resultado: " + divisao);
			if(divisao%2 == 0) {
				System.out.println("PAR");
			}
			else {
				System.out.println("IMPAR");
			}
			if(divisao >= 0) {
				System.out.println("POSITIVO");
			}
			else {
				System.out.println("NEGATIVO");
			}
			if(divisao%1 == 0) {
				System.out.println("INTEIRO");
			}
			else {
				System.out.println("DECIMAL");
			}
		}		
	}

}
