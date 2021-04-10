package tad;

public class AppQueue {
    public static void main(String[] args) {
        Queue fila = new Queue(4);

        System.out.println("Vazia: " + fila.isEmpty());
        System.out.println("Cheia: " + fila.isFull());

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        fila.enqueue(40);

        System.out.println("Vazia: " + fila.isEmpty());
        System.out.println("Cheia: " + fila.isFull());

        System.out.println("Primeiro da fila: " + fila.peek());
        System.out.println("Qtde de números na fila: " + fila.size());
        System.out.println("Fila: " + fila.show());

        System.out.println("\nRemovendo 1 valor: " + fila.dequeue());
        System.out.println("Fila: " + fila.show());
        System.out.println("Primeiro da fila: " + fila.peek());
        System.out.println("Qtde de números na fila: " + fila.size());
    }
}
