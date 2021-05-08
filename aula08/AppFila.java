public class AppFila {
    public static void main(String[] args) {
        FilaDin fila = new FilaDin();

        System.out.println("Fila vazia? " + fila.isEmpty());
        System.out.println("Primeiro da fila: " + fila.peek());

        fila.enqueue("AAA");
        fila.enqueue("BBB");
        fila.enqueue("CCC");

        System.out.println("Fila vazia? " + fila.isEmpty());

        System.out.println(fila.show());

        System.out.println("Primeiro da fila: " + fila.peek());

        while (!fila.isEmpty()) {
            System.out.println("Removido: "+ fila.dequeue());
        }
        System.out.println("Fila vazia? " + fila.isEmpty());
    }
}
