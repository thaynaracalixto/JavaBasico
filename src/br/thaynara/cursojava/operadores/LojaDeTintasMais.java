package br.thaynara.cursojava.operadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LojaDeTintasMais {

	private static Scanner scan; 

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//EXERCICIO 17
		System.out.println("CALCULADORA DE QUANTIDADE DE TINTA (LATAS OU GALÕES)\n");
		System.out.println("Informe o tamanho da área em Metros Quadrados: ");
		double areaPintar = scan.nextDouble();
		double litros = areaPintar/6;
		double qtdadeGalao = (litros/3.6);
		double qtdadeLatas = (litros/18);
		double valorLata = qtdadeLatas*80.00;
		double valorGalao = qtdadeGalao*25.00;
		
		System.out.println("Você irá precisar de: " + new DecimalFormat(".##").format(qtdadeLatas) + " Latas de Tinta de 18 Litros, pelo valor de R$ " + new DecimalFormat(".##").format(valorLata));
		System.out.println("***OU***");
		System.out.println("Você irá precisar de: " + new DecimalFormat(".##").format(qtdadeGalao) +  " Galões de Tinta de 3.6 Litros, pelo valor de R$ " + new DecimalFormat(".##").format(valorGalao));
	}
}
