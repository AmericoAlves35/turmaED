package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtdeLampadas;
        boolean[] lamapadas;

        System.out.println("Quantas lampadas teremos?");
        qtdeLampadas = in.nextInt();

        lamapadas = new boolean[qtdeLampadas];

        for (int caminhada = 1; caminhada <= lamapadas.length; caminhada++) {
            for (int posicao = 1; posicao <= lamapadas.length; posicao++) {
                if (posicao % caminhada == 0) {
                    lamapadas[posicao - 1] = !lamapadas[posicao - 1];
                }
            }

        }

        System.out.print("[ ");
        for (int i = 0; i < lamapadas.length; i++) {
            /*
             if (lamapadas[i]) { 
                 System.out.print("On ");
             } else {
              System.out.print("Off ");
             }
             */
            System.out.print((lamapadas[i]) ? "On " : "Off ");
        }
        System.out.print("]");
        in.close();
    }
}
