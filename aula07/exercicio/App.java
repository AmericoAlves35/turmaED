package exercicio;

public class App {
    public static void main(String[] args) {
        PilhaDin p = new PilhaDin();
        // String frase = "AC";
        // String frase = "ACBA";
        // String frase = "ABCBA";
        String frase = "BBACABB";

        int tamanhoFrase = frase.length();
        int meio = (tamanhoFrase - 1) / 2;

        if(tamanhoFrase % 2 == 0 || frase.charAt(meio) != 'C') {
            System.out.println("Fora do padrão.");
            return;
        }
        
        for(int i = 0; frase.charAt(i) != 'C'; i++) {
            p.empilhar(frase.charAt(i));
        }

        while(!p.estaVazia()) {
            char atual = p.desempillhar();
            if(frase.charAt(++meio) != atual ) {
                System.out.println("Fora do padrão.");
                return;
            }
        }

        System.out.println("Está no padrão.");

    }
}
