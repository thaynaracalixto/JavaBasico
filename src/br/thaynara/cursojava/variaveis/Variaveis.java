package br.thaynara.cursojava.variaveis;

public class Variaveis {

	public static void main(String[] args) {
	
		int idade = 21;
		String nomePessoa = "Thaynara";
		String nomePet = "Não possui";
		char o = 111;
		char i = 105;
		double d2 = 1.234e2; //NOTACAO CIENTIFICA
		//char o = 'o';
		//char i = 'i';		
		int decVal = 26;
		int hexVal = 0x1a;
		int octVal = 032;
		int binVal = 0b11010;
		
		System.out.println("Nome: " + nomePessoa);
		System.out.println("idade: " + idade);
		System.out.println("Nome do Pet: " + nomePet);
		//System.out.println(o + i); //NESTE CASO ELE SOMA O VALOR DO O E DO I DE ACORDO COM A NÚMERAÇÃO NA TABELA ASCII
		System.out.println("" + o + i); // AS ASPAS TRANSFORMA EM CARACTERE
		System.out.println(d2); 
		System.out.println("" + decVal + hexVal + octVal + binVal); 
	}

}
