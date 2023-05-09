package br.thaynara.cursojava.operadores;

import java.util.Scanner;

public class ConversorMedidas {
	
	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		//EXERCICIO 5
		System.out.println("TRANSFORMANDO METROS EM CENTÍMETROS\n");
		System.out.println("Digite um valor em metros: ");
		double metro = scan.nextDouble();
		double resCm = metro*100;
		System.out.println("O valor em Centímetros é: " + resCm);
		
		//EXERCICIO 5
		System.out.println("TRANSFORMANDO CENTÍMETROS EM METROS\n");
		System.out.println("Digite um valor em Centímetros: ");
		double cm = scan.nextDouble();
		double resMetro = cm/100;
		System.out.println("O valor em Metros é: " + resMetro);

	}

}
