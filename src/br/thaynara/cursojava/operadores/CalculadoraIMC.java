package br.thaynara.cursojava.operadores;

import java.util.Scanner;

public class CalculadoraIMC {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//EXERCICIO 13 PT 2
		System.out.println("CALCULADORA IMC");
		System.out.println("Informe a sua altura em metros: ");
		double altura = scan.nextDouble();
		System.out.println("Informe o seu Peso em Kg");
		double peso = scan.nextDouble();	
		var imc = peso/(altura*altura);
		
		if(imc < 18.5) {
			System.out.println("Cuidado! Você está abaixo do Peso.");		
		}
		else if ((imc > 18.5) && (imc < 24.9)) {
			System.out.println("Parabéns 🌟, você está com Peso Ideal!");			
		}
		else {
			System.out.println("Cuidado! Você está acima do Peso!");
		}

	}

}
