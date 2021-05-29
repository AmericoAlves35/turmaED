public class App {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        lista.insertLast(10);
        lista.deleteLast();

        System.out.println("lista: " + lista.displayForward());
        
        lista.insertLast(10);
        lista.insertLast(20);
        lista.insertLast(30);
        lista.insertLast(40);
        lista.insertLast(50);
        lista.insertLast(60);
        //lista.deleteLast();

        No primeiro = lista.getfirst();
        System.out.println("Primeiro: " + primeiro.getValue());

        // primeiro.setValue(20);

        System.out.println("lista: " + lista.displayForward());

        No del = lista.delete(30);
        //del.getNextNo().setValue(200);
        System.out.println(del.getValue() + ", " + del.getPrevNo() + ", " + del.getNextNo());

        // System.out.println("Revendo o " + lista.delete(30).getValue());
        System.out.println("lista: " + lista.displayForward());

        System.out.println("Revendo o " + lista.delete(50).getValue());
        System.out.println("lista: " + lista.displayForward());

        //System.out.println("lista: " + lista.displayBackward());

    }
}
