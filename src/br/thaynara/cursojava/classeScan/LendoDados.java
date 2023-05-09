package br.thaynara.cursojava.classeScan;

import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {

			try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Digite seu Primeiro Nome: , Sua Idade: , Sua Altura: , Se possui bichinho de Estimacao: ");
				String nome = scan.next();
				int idade = scan.nextInt();
				double altura = scan.nextDouble();
				boolean temPet = scan.nextBoolean();
				
				System.out.println("Você informou os seguintes Dados: ");
				System.out.println("Nome: " + nome);
				System.out.println("Idade: " + idade);
				System.out.println("Altura: " + altura);
				System.out.println("Tem Bichinho de Estimação: " + temPet);
			}
		
		
		
	}

}
