package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex17AnoBissexto {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//VERIFICA SE O ANO INFORMADO É BISSEXTO
		System.out.println("ANO BISSEXTO?");
		System.out.println("Informe um ano: (xxxx) ");
		int ano = scan.nextInt();
		
		if((ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))) {
			System.out.println("O ano " + ano + " é um ano Bissexto.");
		}
		else {
			System.out.println("O ano " + ano + " NÃO é um ano Bissexto.");
		}
	}

}
