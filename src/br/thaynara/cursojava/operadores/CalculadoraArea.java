package br.thaynara.cursojava.operadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraArea {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//EXERCICIO 6
		System.out.println("CALCULANDO A ÁREA DO CIRCULO\n");
		System.out.println("Informe a medida do raio: ");
		double raio = scan.nextDouble();
		double areaCirculo =  Math.PI*(raio*raio);
		System.out.println("A área do Circulo é: " + new DecimalFormat(".##").format(areaCirculo));

		//EXERCICIO 7
		System.out.println("CALCULANDO A ÁREA DO QUADRADO\n");
		System.out.println("Informe a medida do Lado do Quadrado: ");
		double lado = scan.nextDouble();
		double areaQuadrado =  (lado*lado);
		System.out.println("A área do Quadrado é: " + new DecimalFormat(".##").format(areaQuadrado));
		double dobroArea = (areaQuadrado*2);
		System.out.println("O dobro da área é: " + new DecimalFormat(".##").format(dobroArea));

	}

}
