package TerceiroDesafio;

import java.util.Scanner;

public class TerceiroDesafio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int contador = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] - arr[j] == k) {
                    contador++;
                }
            }
        }

        System.out.println(contador);

        input.close();

    }

}
