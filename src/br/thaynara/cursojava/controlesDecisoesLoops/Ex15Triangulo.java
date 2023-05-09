package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex15Triangulo {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//VERIFICA TIPO DO TRIÂNGULO
		System.out.println("TRIÂNGULOS");
		System.out.println("Valor do Primeiro Lado:");
		int lado1 = scan.nextInt();
		System.out.println("Valor do Segundo Lado:");
		int lado2 = scan.nextInt();
		System.out.println("Valor do Terceiro Lado:");
		int lado3 = scan.nextInt();
		
		if((lado1 + lado2) > lado3) {
			if(lado1 == lado2 && lado2 == lado3) {
				System.out.println("Triângulo Equilátero");
			}
			else if(lado1 == lado2 || lado1 == lado3) {
				System.out.println("Triângulo Isóceles");
			}
			else if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
				System.out.println("Triângulo Escaleno");
			}	
		}
		else {
			System.out.println("Não é um Triângulo");
		}

	}

}
