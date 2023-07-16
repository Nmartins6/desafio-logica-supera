package SegundoDesafio;

import java.util.Scanner;

public class SegundoDesafio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valor = input.nextDouble();
        int valorInteiro = (int) (valor * 100);

        System.out.println("NOTAS:");
        int[] notas = { 10000, 5000, 2000, 1000, 500, 200 };
        for (int nota : notas) {
            System.out.printf("%d\tnota(s)\tde\tR$\t%.2f\n", valorInteiro / nota, nota / 100.0);
            valorInteiro %= nota;
        }

        System.out.println("MOEDAS:");
        int[] moedas = { 100, 50, 25, 10, 5, 1 };
        for (int moeda : moedas) {
            System.out.printf("%d\tmoeda(s)\tde\tR$\t%.2f\n", valorInteiro / moeda, moeda / 100.0);
            valorInteiro %= moeda;
        }

        input.close();
    }

}
