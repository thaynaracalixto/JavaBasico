package br.thaynara.cursojava.controlesDecisoesLoops;

public class ExFatorial {

    public static double recursive(double d) {
        if (d <= 1) {
            return 1;
        } else {
            return d * recursive(d - 1);
        }
    }

    public static void main(String[] args) {
        double result = recursive(6);
        System.out.println("O fatorial de 6 é: " + result);
    }
}
