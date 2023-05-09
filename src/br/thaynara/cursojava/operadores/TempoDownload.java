package br.thaynara.cursojava.operadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TempoDownload {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//EXERCICIO 18
		System.out.println("CALCULA O TEMPO DE DOWNLOAD\n");
		System.out.println("Informe o tamanho do arquivo em Mb: ");
		double tamArquivo = scan.nextDouble();
		System.out.println("Informe a velocidade da internet em Mbps: ");
		double velInternet = scan.nextDouble();
		double tempoDownload = tamArquivo / velInternet;
		System.out.println("O tempo aproximado de Download é de: " + new DecimalFormat(".###").format(tempoDownload));
	}

}
