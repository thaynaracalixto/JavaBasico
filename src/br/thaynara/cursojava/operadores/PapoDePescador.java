package br.thaynara.cursojava.operadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PapoDePescador {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//EXERCICIO 14
		System.out.println("CALCULA IMPOSTO PEIXES\n");
		System.out.println("Digite a Quantidade de Peixes em Quilos: ");
		double pesoPeixe = scan.nextDouble();
		double multa = 0;
		double excedente = pesoPeixe - 50;
		
		if (pesoPeixe > 50) {
			multa = excedente * 4;			
		}
		else {
			multa = 0.00;
		}
		System.out.println("O valor da multa a ser paga é: R$" + new DecimalFormat(".##").format(multa));
	}

}
