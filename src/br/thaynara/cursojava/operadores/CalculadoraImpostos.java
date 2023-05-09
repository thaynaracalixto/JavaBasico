package br.thaynara.cursojava.operadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraImpostos {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//EXERCICIO 15
		System.out.println("CALCULADORA IMPOSTOS SALÁRIO\n");
		System.out.println("Valor recebido por hora trabalhada: R$");
		double valorHora = scan.nextDouble();
		System.out.println("Número de Horas trabalhadas no mês: ");
		int horasTrabalho = scan.nextInt();		
		var salarioBruto = (horasTrabalho*valorHora);
		System.out.println("O seu Salário Bruto Mensal é: R$" + new DecimalFormat(".##").format(salarioBruto) + "\n");
		
		var impIR = salarioBruto*0.11;
		System.out.println("Você pagou R$ " + new DecimalFormat(".##").format(impIR) + " de Imposto de Renda");
		var impInss = salarioBruto*0.08;
		System.out.println("Você pagou R$ " + new DecimalFormat(".##").format(impInss) + " de INSS");
		var impSind = salarioBruto*0.05;
		System.out.println("Você pagou R$ " + new DecimalFormat(".##").format(impSind) + " de Imposto ao Sindicato \n");
		var descontos = impIR+impInss+impSind;
		
		var salarioLiquido = salarioBruto-descontos;
		System.out.println("Total de Descontos: R$" + new DecimalFormat(".##").format(descontos) + "\n");
		System.out.println("O seu Salário Liquido Mensal é: R$" + new DecimalFormat(".##").format(salarioLiquido) + "\n");
		
	

	}

}
