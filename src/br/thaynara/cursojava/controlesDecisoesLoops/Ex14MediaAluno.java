package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex14MediaAluno {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//CALCULA MEDIA ALUNO E INFORMA APROVAÇÃO OU NÃO
		System.out.println("BOLETIM ESCOLAR");
		System.out.println("Informe - Primeira Nota:");
		double nota1 = scan.nextDouble();
		System.out.println("Informe - Segunda Nota:");
		double nota2 = scan.nextDouble();
		double media = (nota1+nota2)/2;
		String conceito = null;
		
		if (media <= 4) {
			conceito = "E";
			System.out.println("Conceito: " + conceito);
		}
		else if (media > 4 && media <= 6) {
			conceito = "D";
			System.out.println("Conceito: " + conceito);
		}
		else if(media > 6 && media <= 7.5) {
			conceito = "C";
			System.out.println("Conceito: " + conceito);
		}
		else if (media > 7.5 && media <= 9) {
			conceito = "B";
			System.out.println("Conceito: " + conceito);
		}
		else if (media > 9 ) {
			conceito = "A";
			System.out.println("Conceito: " + conceito);
		}
		
		//VERIFICANDO O CONCEITO OBTIDO
		if (conceito == "A" || conceito == "B"|| conceito == "C") {
			System.out.println("APROVADO");
		}
		else {
			System.out.println("REPROVADO");
		}
		

	}

}
