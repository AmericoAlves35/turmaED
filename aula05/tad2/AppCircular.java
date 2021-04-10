package tad2;

public class AppCircular {

    public static void main(String[] args) {
        CircularQueue fila = new CircularQueue(3);

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Fila: " + fila.show());

        System.out.println("removendo: " + fila.dequeue());
        System.out.println("removendo: " + fila.dequeue());

        fila.enqueue(40);
        fila.enqueue(50);
        
        System.out.println("removendo: " + fila.dequeue());

        System.out.println("Primeiro da fila: " + fila.peek());
        System.out.println("Qtde de números na fila: " + fila.size());
        System.out.println("Fila: " + fila.show());


    }
}