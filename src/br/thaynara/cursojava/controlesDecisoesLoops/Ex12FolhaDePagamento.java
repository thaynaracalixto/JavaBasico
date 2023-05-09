package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex12FolhaDePagamento {
	
	private static Scanner scan;

	public static void main(String[] args) {
	
		scan = new Scanner(System.in);
		
		//PROGRAMA FOLHA DE PAGAMENTO
		//CALCULANDO SALARIO BRUTO
		System.out.println("FOLHA DE PAGAMENTO");
		System.out.println("Informe - Horas Trabalhadas no mês:");
		double qtdadeHoras = scan.nextDouble();
		System.out.println("Informe - Valor recebido por hora: (em R$)");
		double valorHora = scan.nextDouble();
		double salarioBruto = qtdadeHoras*valorHora;
		System.out.println("");
		System.out.println("Salário Bruto : R$" + salarioBruto);
		
		//CALCULANDO DESCONTO IR
		double descIR = 0;	
		if(salarioBruto <= 900.00) {
			System.out.println("(-) IR (ISENTO) : R$"+ descIR);
		}
		else if (salarioBruto > 900.00 && salarioBruto <= 1500.00) {
			descIR = (salarioBruto*0.05);
			System.out.println("(-) IR (5%) : R$" + descIR);
		}
		else if (salarioBruto > 1500.00 && salarioBruto <= 2500.00) {
			descIR = (salarioBruto*0.1);
			System.out.println("(-) IR (10%) : R$" + descIR);
		}
		else if (salarioBruto > 2500.00) {
			descIR = (salarioBruto*0.2);
			System.out.println("(-) IR (20%) : R$" + descIR);
		}
		
		//CALCULANDO DESCONTO IR
		double descINSS = salarioBruto*0.10;
		System.out.println("(-) INSS (10%) : R$" + descINSS);
		
		//CALCULANDO FGTS
		double fgts = salarioBruto*0.11;
		System.out.println("FGTS (11%) : R$" + fgts);
		
		//CALCULANDO DESCONTOS
		double descontos = descIR+descINSS;
		System.out.println("(-) Total de Descontos : R$" + descontos);	
		
		//CALCULANDO SALARIO LIQUIDO
		double salarioLiquido = salarioBruto-descontos;
		System.out.println("Salário Líquido : R$" + salarioLiquido);
	}

}
