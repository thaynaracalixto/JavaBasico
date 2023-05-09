package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex04VogalOrConsoante {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//VOGAL OU CONSOANTE
		System.out.println("VOGAL OU CONSOANTE?");
		System.out.println("Digite uma Letra do Alfabeto: ");
		String letra = scan.next();
		
		switch(letra) {
		case "A": System.out.println("A letra digitada é VOGAL"); break;
		case "E": System.out.println("A letra digitada é VOGAL"); break;
		case "I": System.out.println("A letra digitada é VOGAL"); break;
		case "O": System.out.println("A letra digitada é VOGAL"); break;
		case "U": System.out.println("A letra digitada é VOGAL"); break;
		case "a": System.out.println("A letra digitada é VOGAL"); break;
		case "e": System.out.println("A letra digitada é VOGAL"); break;
		case "i": System.out.println("A letra digitada é VOGAL"); break;
		case "o": System.out.println("A letra digitada é VOGAL"); break;
		case "u": System.out.println("A letra digitada é VOGAL"); break;
		default: System.out.println("A letra digitada é CONSOANTE");		
		}
	}

}
