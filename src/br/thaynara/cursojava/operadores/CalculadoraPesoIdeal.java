package br.thaynara.cursojava.operadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraPesoIdeal {
	
	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		//EXERCICIO 12 
		System.out.println("CALCULADORA PESO IDEAL\n");
		System.out.println("Digite a sua altura em metros: ");
		double altura = scan.nextDouble();
		double pesoIdeal = (72.7*altura)- 58;
		System.out.println("O seu Peso ideal é: " + new DecimalFormat(".##").format(pesoIdeal)+ "Kg\n");
	}

}
