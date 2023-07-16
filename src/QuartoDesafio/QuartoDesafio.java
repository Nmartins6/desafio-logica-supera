package QuartoDesafio;

import java.util.Scanner;

public class QuartoDesafio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        for(int i = 0 ; i < n ; i++) {
            String linha = input.nextLine();
            String corrigido = corrigeLinha(linha);

            System.out.println(corrigido);
        }

        input.close();

    }

    public static String corrigeLinha(String linha) {
        int tamanho = linha.length();
        int metade = tamanho / 2;
        String primeiraMetade = new StringBuilder(linha.substring(0,metade)).reverse().toString();
        String segundaMetade = new StringBuilder(linha.substring(metade)).reverse().toString();

        return primeiraMetade + segundaMetade;
    }

}
