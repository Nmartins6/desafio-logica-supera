package PrimeiroDesafio;

import java.util.*;

public class PrimeiroDesafio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine();

        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        for (int i = 0 ; i < N ; i++) {
            int verifica = input.nextInt();

            if (verifica  % 2 == 0) {
                par.add(verifica);
            } else {
                impar.add(verifica);
            }
        }

        Collections.sort(par);
        impar.sort(Collections.reverseOrder());

        for (int numPar : par)
        {
            System.out.println(numPar);
        }

        for(int numImpar : impar)
        {
            System.out.println(numImpar);
        }

        input.close();
    }
}