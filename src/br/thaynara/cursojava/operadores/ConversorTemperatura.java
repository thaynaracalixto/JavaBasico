package br.thaynara.cursojava.operadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorTemperatura {
	
	private static Scanner scan;
	
	public static void main (String[] args) {
		
	scan = new Scanner(System.in);
	
			//EXERCICIO 9
			System.out.println("\u001b[1mTRANSFORMANDO TEMPERATURA Fº PARA Cº\n");
			System.out.println("Informe a Temperatura em Grau Fahrenheit: ");
			double grauF = scan.nextDouble();
			double grauC = (5* (grauF - 32)/9);
			System.out.println("A temperatura em Grau Celsius é: " + new DecimalFormat(".##").format(grauC)+ "\n");
					
			//EXERCICIO 10
			System.out.println("\u001bTRANSFORMANDO TEMPERATURA Cº PARA Fº\n");
			System.out.println("Informe a Temperatura em Grau Celsius: ");
			double grauC2 = scan.nextDouble();
			double grauF2 = (grauC2*9/5)+32;
			System.out.println("A temperatura em Grau Fahrenheit é: " + new DecimalFormat(".##").format(grauF2)+ "\n");
	}
}
