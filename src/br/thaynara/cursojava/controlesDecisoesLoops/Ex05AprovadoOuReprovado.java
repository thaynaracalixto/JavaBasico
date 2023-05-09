package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex05AprovadoOuReprovado {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//VERIFICA APROVAÇÃO OU REPROVAÇÃO
		System.out.println("APROVADO OU REPROVADO?");
		System.out.println("Informe a Primeira Nota: (1 a 10) ");
		double nota1 = scan.nextDouble();
		System.out.println("Informe a Segunda Nota: (1 a 10 ");
		double nota2 = scan.nextDouble();
		double media = (nota1+nota2)/2;
		
		if((media >= 7) && (media < 10)) {
			System.out.println("ALUNO APROVADO");			
		}
		else if(media < 7) {
			System.out.println("ALUNO REPROVADO");			
		}
		else if(media == 10){
			System.out.println("ALUNO APROVADO COM DISTINÇÃO");
		}
		else {
			System.out.println("NOTA INVÁLIDA");
		}
	}

}
