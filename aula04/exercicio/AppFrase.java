package exercicio;

public class AppFrase {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(30);
        String frase = "ESTE EXERCICIO E MUITO FACIL";

        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == ' ') {
                while(!pilha.estaVazia()) {
                    System.out.print(pilha.desempillhar());
                }
                System.out.print(' '); // separa cada palavra no prompt
            }else{
                pilha.empilhar(frase.charAt(i)); // charAt( x ) retorna o caracter da posição x
            }
        }
        while(!pilha.estaVazia()) {
            System.out.print(pilha.desempillhar());
        }
    }

}
