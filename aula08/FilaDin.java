public class FilaDin {
    private No inicio, fim;

    public FilaDin() {
        inicio = fim = null;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void enqueue(String nome) {
        No novo = new No(nome);

        if(isEmpty()) {
            inicio = fim = novo;
        }else{
            //aponta o próximo do último para o novo No
            fim.setProx(novo);
            // movo o "fim" para o novo No
            fim = novo;

        }
    }

    public String show() {
        String saida = "Fila: ";
        No aux = inicio;

        while( aux != null) {
            saida += aux.getPessoa().getNome() + ", ";
            aux = aux.getProx();
        }
        return saida;
    }

    public String peek() { 
        if(isEmpty()) {
            return "";
        }
        return inicio.getPessoa().getNome();
    }

    public String dequeue() {
        if(isEmpty()) {
            return "";
        }
        No aux = inicio;
        // aponta o "inicio" para o próximo No
        inicio = inicio.getProx();

        if(inicio == null) { // se a fila ficou vazia
            fim = null;
        }

        return aux.getPessoa().getNome();
    }
}
