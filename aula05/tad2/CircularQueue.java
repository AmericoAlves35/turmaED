package tad2;


public class CircularQueue {

    private int[] vector;
    private int end; // indica a última posição da fila
    private int begin; // indica a posição do primeiro da fila
    private int amount; // quantos elementos existem na fila

    public CircularQueue(int size) {
        vector = new int[size];
        end = 0;
        begin = 0;
        amount = 0;
    }

    public boolean isEmpty() { // verifica se está vazio
        return (amount == 0);
    }

    public boolean isFull() { // verifica se está cheio
        return (amount == vector.length);
    }

    public void enqueue(int value) { // insere um novo valor na fila
        if (isFull()) {
            return; // termina a execução do método
        }
        vector[end] = value;
        amount++;
        end = (end + 1) % vector.length;
    }

    public int dequeue() { // remove um elemento da fila
        if(isEmpty()){
            return -1; //-1 representa um valor inválido, quando a fila está vazia
        }
        int aux = vector[begin];
        begin = (begin + 1) % vector.length;
        amount--;
        return aux;
    }

    public int peek() { // informa quem é o primeiro elemento da fila
        if(!isEmpty()){
            return vector[begin];
        }
        return -1; // -1 representa um valor inválido, quando a fila está vazia
    }

    public int size() { // quantos elementos existem na fila
        return amount;
    }

    public String show() {  // retorna todos os valores da fila em forma de String
        String elem = "";

        if(isEmpty()){
            return "";
        }

        int aux = begin;
        do {
            elem = elem + vector[aux] + " ";
            aux = (aux + 1) % vector.length;
        } while(aux != end);

        return elem;
    }
}