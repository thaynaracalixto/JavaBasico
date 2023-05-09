package br.thaynara.cursojava.operadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraSalario {
	
	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		//EXERCICIO 8
		System.out.println("CALCULANDO SALÁRIO MENSAL\n");
		System.out.println("Número de Horas trabalhadas no mês: ");
		double horasTrabalho = scan.nextDouble();
		System.out.println("Valor recebido por hora trabalhada: ");
		double valorHora = scan.nextDouble();
		double salario = (horasTrabalho*valorHora);
		System.out.println("O seu Salário Mensal é: R$" + new DecimalFormat(".##").format(salario));

	}

}
