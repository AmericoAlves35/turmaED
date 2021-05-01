package exercicio;

public class No {
    private char valor;
    private No proximo;

    public No(char valor) {
        this.valor = valor;
        proximo = null;
    }

    public char getValor() {
        return valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
}
