package util;

import model.Client;

public class Queue {
    private No inicio, fim;
    private int size;

    public Queue() {
        inicio = fim = null;
        size = 0;
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
        size++;
    }

    public String show() {
        String saida = "";
        No aux = inicio;

        if(isEmpty()) {
            return "vazia";
        }
        
        while( aux != null) {
            saida += aux.getClient() + "-";
            aux = aux.getProx();
        }
        return saida;
    }

    public Client peek() { 
        if(isEmpty()) {
            return null;
        }
        return inicio.getClient();
    }

    public Client dequeue() {
        if(isEmpty()) {
            return null;
        }
        No aux = inicio;
        
        inicio = inicio.getProx();

        if(inicio == null) { 
            fim = null;
        }
        size--;
        return aux.getClient();
    }

    public int getSize() {
        return size;
    }
}
