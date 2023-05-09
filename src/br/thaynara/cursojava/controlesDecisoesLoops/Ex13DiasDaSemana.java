package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex13DiasDaSemana {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		//DIA DA SEMANA		
		System.out.println("Entre com um dia da semana (1-7) ");
		int diaSemana = scan.nextInt();

		/*switch (diaSemana) {
		case 1: System.out.println("DOMINGO"); break; //BREAK É COMO FECHAR OS PARENTESES, SENÃO ELE EXECUTA TUDO ATÉ ENCONTRAR UM BREAK
		case 2: System.out.println("SEGUNDA"); break;
		case 3: System.out.println("TERÇA"); break;
		case 4: System.out.println("QUARTA"); break;
		case 5: System.out.println("QUINTA"); break;
		case 6: System.out.println("SEXTA"); break;
		case 7: System.out.println("SÁBADO"); break;
		default: System.out.println("NÃO É UM DIA VÁLIDO!"); //DEFAULT É USADO PARA O QUE ESTIVER FORA DOS CASE
		}*/

		switch (diaSemana) {
		case 2: 
		case 3:
		case 4: 
		case 5: 
		case 6: System.out.println("É DIA ÚTIL"); break;
		case 1:
		case 7: System.out.println("É FINAL DE SEMANA"); break;
		default: System.out.println("NÃO É UM DIA VÁLIDO!"); //DEFAULT É USADO PARA O QUE ESTIVER FORA DOS CASE

		}

	}
}
