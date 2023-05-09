package br.thaynara.cursojava.controlesDecisoesLoops;

import java.util.Scanner;

public class MaiorDeIdade {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		
		//IF E ELSE - VERIFICAR SE É MAIOR DE IDADE
		System.out.println("Informe a sua Idade: ");
		int idade = scan.nextInt();
		
		if (idade < 18) {
			System.out.println("Você é menor de idade! ");
		}
		else {
			System.out.println("Você já é maior de Idade, já pode Dirigir! ");
		}
		
		//VERIFICAR SE PRODUTO ESTA BARATO
		System.out.println("Informe o valor do Produto: ");
		int valorProduto = scan.nextInt();
		
		if (valorProduto <= 10) {
			System.out.println("Pode Comprar, esta Barato!");
		}
		else if ((valorProduto > 10) && (valorProduto < 15 )) {
			System.out.println("É melhor pedir um Desconto!");
		}
		else if ((valorProduto >= 15) && (valorProduto < 17 )) {
			System.out.println("Pesquise mais, pode encontrar mais barato!");
		}
		else {
			System.out.println("Não Compre, está muito Caro!!");
		}
		
		/*//VERIFICAR DIA DA SEMANA
		System.out.println("ENTRE COM UM DIA DA SEMANA (1-7) ");
		int diaSemana = scan.nextInt();

		if (diaSemana == 1) {
			System.out.println("DOMINGO");
		}
		else if (diaSemana == 2) {
			System.out.println("SEGUNDA");
		}
		else if (diaSemana == 3) {
			System.out.println("TERÇA");
		}
		else if (diaSemana == 4) {
			System.out.println("QUARTA");
		}
		else if (diaSemana == 5) {
			System.out.println("QUINTA");
		}
		else if (diaSemana == 6) {
			System.out.println("SEXTA");
		}
		else if (diaSemana == 7) {
			System.out.println("SÁBADO");
		}
		else{
			System.out.println("NÃO É DIA VÁLIDO! ");
		}*/
		
		
	}

}
