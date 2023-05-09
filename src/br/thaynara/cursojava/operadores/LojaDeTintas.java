package br.thaynara.cursojava.operadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LojaDeTintas {
	
	private static Scanner scan; 

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//EXERCICIO 16
		System.out.println("CALCULADORA DE QUANTIDADE DE TINTA APENAS LATAS DE 18 LITROS\n");
		System.out.println("Informe o tamanho da área em Metros Quadrados: ");
		double areaPintar = scan.nextDouble();
		double qtdadeTinta = areaPintar/3;
		double qtdadeLatas = (qtdadeTinta/18);
		double valorLata = qtdadeLatas*80;;
		System.out.println("Você irá precisar de: " + new DecimalFormat(".##").format(qtdadeLatas) + " Latas de Tinta de 18 Litros, pelo valor de R$ " + new DecimalFormat(".##").format(valorLata));
	}

}
