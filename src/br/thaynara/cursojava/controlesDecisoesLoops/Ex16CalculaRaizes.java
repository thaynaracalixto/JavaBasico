package br.thaynara.cursojava.controlesDecisoesLoops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex16CalculaRaizes {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		//CALCULA RAIZES
		//aX^2 + bX + c
		System.out.println("EQUAÇÃO DE 2º GRAU");
		System.out.println("Informe um número: ");
		int a = scan.nextInt();

		if(a <= 0) {
			System.out.println("Não é uma equação de 2º Grau");
		}
		else {
			System.out.println("Informe outro número: ");
			int b = scan.nextInt();
			System.out.println("Informe mais um número: ");
			int c = scan.nextInt();

			//CALCULANDO DELTA E RAIZES X1 E X2
			double delta = (b*b)-4*a*c;
			if(delta < 0) {
				System.out.println("DELTA NEGATIVO! Não possui raízes reais. " + delta);		
			}
			else {				
				System.out.println("VALOR DE DELTA: " + delta);
				double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2*a);;

				System.out.println("Raizes: " + new DecimalFormat(".##").format(x1) + " | "  + new DecimalFormat(".##").format(x2));
			}
		}
	}

}
