public class Queue {
    private No inicio, fim;

    public Queue() {
        inicio = fim = null;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void enqueue(String name, int age) {
        No novo = new No(name, age);

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
            saida += aux.getClient().getName() + ", ";
            aux = aux.getProx();
        }
        return saida;
    }

    public String peek() { 
        if(isEmpty()) {
            return "";
        }
        return inicio.getClient().getName();
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

        return aux.getClient().getName();
    }
}
