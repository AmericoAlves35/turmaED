
public class No {
    private int valor;
    private No proximo;

    public No(int valor) {
        this.valor = valor;
        proximo = null;
    }

    public int getValor() {
        return valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
}
