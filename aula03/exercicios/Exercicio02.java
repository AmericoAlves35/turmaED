package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] notas = new double[10];
        double media = 0;
        int maiores = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %dº nota: ", (i+1));
            notas[i] = teclado.nextDouble();
            media += notas[i]; // media = media + notas[i];
        }

        media /= notas.length;

        for (int i = 0; i < notas.length; i++) {
            if(notas[i] > media) {
                maiores++;
            }
        }

        System.out.printf("Média: %.2f\n", media);
        System.out.println("Notas acima da média: " + maiores);

        teclado.close();
    }
}
