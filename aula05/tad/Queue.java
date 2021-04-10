package tad;

public class Queue {
    private int[] vector;
    private int end;

    public Queue(int size) {
        vector = new int[size];
        end = 0;
    }

    public boolean isEmpty() { // verifica se está vazio
        return (end == 0);
    }

    public boolean isFull() { // verifica se está cheio
        return (end == vector.length);
    }

    public void enqueue(int value) { // insere um novo valor na fila
        if (isFull()) {
            return; // termina a execução do método
        }
        vector[end] = value;
        end++;
    }

    public int dequeue() { // remove um elemento da fila
        if(isEmpty()){
            return -1; //-1 representa um valor inválido, quando a fila está vazia
        }
        int aux = vector[0];
        for (int i = 0; i < end-1; i++) { // end-1 pois termina uma posição antes do final
            vector[i] = vector[i+1];
        }
        end--;
        return aux;
    }

    public int peek() { // informa quem é o primeiro elemento da fila
        if(!isEmpty()){
            return vector[0];
        }
        return -1; // -1 representa um valor inválido, quando a fila está vazia
    }

    public int size() { // quantos elementos existem na fila
        return end;
    }

    public String show() {  // retorna todos os valores da fila em forma de String
        String elem = "";

        for (int i = 0; i < end; i++) {
            elem = elem + vector[i] + " ";
        }

        return elem;
    }

}