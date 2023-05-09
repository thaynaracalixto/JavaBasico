package br.thaynara.cursojava.vetores;

public class Arrays {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 28.3;
		temperaturas[3] = 30.5;
		temperaturas[4] = 31.6;
		
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
		System.out.println("O tamanho do Array: " + temperaturas.length);
		System.out.println("Os valores do Array: ");
		
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.println("Temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
		}
		
		/*for(double temp: temperaturas) { //FOR MELHORADO, MAS NÃO MOSTRA A POSIÇÃO, APENAS O VALOR.
			System.out.println(temp);
		}*/
	}
	

}
