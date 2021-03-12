package exemplos;

public class Exemplo01 {

    public static void main(String[] args) {
        int[] numeros;

        final int TAMANHO = 10; // Constante

        numeros = new int[TAMANHO];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (i + 1);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}