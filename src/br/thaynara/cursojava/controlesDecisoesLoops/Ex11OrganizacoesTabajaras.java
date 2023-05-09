package br.thaynara.cursojava.controlesDecisoesLoops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex11OrganizacoesTabajaras {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//CALCULANDO REAJUSTE DE SÁLARIO
		System.out.println("CALCULO DO REAJUSTE");
		System.out.println("Informe o seu Salário Atual: (em R$)");
		double salario = scan.nextDouble();
		double salarioNovo = 0;		
		System.out.println("Salário Antes do Reajuste: R$" + salario);
	
		if (salario <= 280.00) {
			salarioNovo = salario+(salario*0.2);
			System.out.println("Percentual de aumento = 20%");
			System.out.println("Novo salario: R$" + salarioNovo);
			System.out.println("valor do aumento: R$" + new DecimalFormat().format(salario*0.2));
		}
		else if (salario > 280.00 && salario < 700.00) {
			salarioNovo = salario + (salario*0.15);
			System.out.println("Percentual de aumento = 15%");
			System.out.println("Novo salario: R$" + salarioNovo);
			System.out.println("valor do aumento: R$" + new DecimalFormat().format(salario*0.15));
		}
		else if (salario >= 700.00 && salario < 1500.00) {
			salarioNovo = salario+(salario*0.1);
			System.out.println("Percentual de aumento = 10%");
			System.out.println("Novo salario: R$" + salarioNovo);
			System.out.println("valor do aumento: R$" + new DecimalFormat().format(salario*0.1));
		}
		else if (salario >= 1500.00) {
			salarioNovo = salario+(salario*0.05);
			System.out.println("Percentual de aumento = 5%");
			System.out.println("Novo salario: R$" + salarioNovo);
			System.out.println("valor do aumento: R$" + new DecimalFormat().format(salario*0.05));
		}
	}
}
