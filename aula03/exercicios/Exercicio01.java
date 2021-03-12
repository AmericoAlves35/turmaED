package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome");
            nomes[i] = entrada.nextLine();
        }

        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.print(nomes[i] + " ");
        }

        entrada.close();
    }
}
