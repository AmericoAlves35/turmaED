public class No {
    private Pessoa pessoa;
    private No prox;

    public No(String nome) {
        pessoa = new Pessoa(nome);
        prox = null;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
    
}
