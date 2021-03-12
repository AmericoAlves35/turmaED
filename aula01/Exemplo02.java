import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um valor inteiro:");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("%d é par\n", numero);
        } else {
            System.out.printf("%d é impar\n", numero);
        }

        teclado.close();
    }
}
