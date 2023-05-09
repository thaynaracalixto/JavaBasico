package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex03VerificaSexo {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//VERIFICA SE DIGITOU F OU M
		System.out.println("VERIFICANDO SEXO");
		System.out.println("Digite uma Letra: (F ou M)");
		String sexo = scan.next();
		
		switch(sexo) {
		case "F": System.out.println("Sexo Feminino"); break;
		case "f": System.out.println("Sexo Feminino"); break;
		case "M": System.out.println("Sexo Masculino"); break;
		case "m": System.out.println("Sexo Masculino"); break;
		default: System.out.println("Sexo inválido");		
		}

	}

}
