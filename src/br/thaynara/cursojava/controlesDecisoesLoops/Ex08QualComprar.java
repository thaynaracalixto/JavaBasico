package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex08QualComprar {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//VER QUAL PRODUTO É MAIS EM CONTA
		System.out.println("VERIFICANDO QUAL MAIOR NÚMERO");
		System.out.println("Informe o Preço do Primeiro Produto: ");
		double valor1 = scan.nextDouble();
		System.out.println("Informe o Preço do Segundo Produto: ");
		double valor2 = scan.nextDouble();
		System.out.println("Informe o Preço do Terceiro Produto: ");
		double valor3 = scan.nextDouble();
		
		if(valor1 <= valor2 && valor1 <= valor3) {
			System.out.println("O produto mais barato é o Produto 1 com o preço de R$" +  valor1);			
		}
		else if(valor2 <= valor1 && valor2 <= valor3) {
			System.out.println("O produto mais barato é o Produto 2 com o preço de R$" +  valor2);			
		}
		else if(valor3 <= valor1 && valor3 <= valor2) {
			System.out.println("O produto mais barato é o Produto 3 com o preço de R$" +  valor3);			
		}
	}

}
