package br.thaynara.cursojava.operadores;
import java.util.Scanner;

public class CalculandoValores {
	
	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		//EXERCICIO 11
		System.out.println("CALCULANDO VALORES");
		System.out.println("Digite um número Inteiro: ");
		int num1 = scan.nextInt();
		System.out.println("Digite outro número Inteiro: ");
		int num2 = scan.nextInt();
		System.out.println("Digite um número Real: ");
		double numReal = scan.nextDouble();
		
		System.out.println("1 - O PRODUTO DO DOBRO DO PRIMEIRO NÚMERO COM METADO DO SEGUNDO NÚMERO");
		int res1 = (num1*2)*(num2/2);
		System.out.println("Resultado: " +  res1);
		
		System.out.println("2 - A SOMA DO TRIPLO DO PRIMEIRO NÚMERO + O TERCEIRO NÚMERO");
		double res2 = (num1*3) + numReal;
		System.out.println("Resultado: " +  res2);
		
		System.out.println("3 - O TERCEIRO NÚMERO ELEVADO AO CUBO");
		double res3 = Math.pow(numReal, 3);	
		System.out.println("Resultado: " +  res3);	
		
	}

}
