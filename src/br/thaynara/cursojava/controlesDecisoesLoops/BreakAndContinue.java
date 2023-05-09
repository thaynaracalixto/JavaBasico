package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class BreakAndContinue {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("***** DIVISIVEL POR 7 *****");
		System.out.println("Informe um número: ");
		int num = scan.nextInt();
		
		System.out.println("Informe um limite: ");
		int max = scan.nextInt();
		
		for(int i = num; i <= max; i++) {
			if(i % 7 == 0 ) {
			System.out.println("O número divisivel por 7 é:" + i);
			//break; - SE QUISER APENAS O PRIMEIRO ARGUMENTO ENCONTRADO
			}
		}
		
	}

}
