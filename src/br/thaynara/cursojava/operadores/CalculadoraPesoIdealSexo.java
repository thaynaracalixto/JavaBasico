package br.thaynara.cursojava.operadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraPesoIdealSexo {
	
	private static Scanner scan;

	public static void main(String[] args) {
	
		scan = new Scanner(System.in);
		
		//EXERCICIO 13
		System.out.println("CALCULADORA PESO IDEAL DE ACORDO COM SEXO\n");
		System.out.println("Digite a sua altura em metros: ");
		double altura = scan.nextDouble();
		System.out.println("Informe o seu Sexo (M - Masculino ou F - Feminino): ");
		String sexo = scan.next();		
		double p_Ideal = 0;
		
		if(sexo == "M" || sexo == "m") {
			p_Ideal = (72.7*altura)- 58;
		} 
		else {
			p_Ideal = (62.1*altura)- 44.7;
		}
		System.out.println("Você informou o sexo: " + sexo + " & O seu peso ideal é: " + new DecimalFormat(".##").format(p_Ideal)+ "Kg\n");
	}
		
}
