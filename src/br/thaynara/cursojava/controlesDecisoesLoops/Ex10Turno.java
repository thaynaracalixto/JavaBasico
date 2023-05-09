package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class Ex10Turno {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//SAUDANDO CONFORME O TURNO
		System.out.println("SAUDAÇÃO");
		System.out.println("Informe o turno em que Estuda: (M- Matutino, V - Vespertino e N - Noturno)");
		String turno = scan.next();
		
		switch(turno) {
		case "M": System.out.println("BOM DIA!"); break;
		case "m": System.out.println("BOM DIA!"); break;
		case "V": System.out.println("BOA TARDE!"); break;
		case "v": System.out.println("BOA TARDE!"); break;
		case "N": System.out.println("BOA NOITE!"); break;
		case "n": System.out.println("BOA NOITE!"); break;
		default: System.out.println("VALOR INVÁLIDO.");		
		}
	}

}
