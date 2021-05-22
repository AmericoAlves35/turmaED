import model.Client;

public class App {
    public static void main(String[] args) {
        ManageAttendance gerencia = new ManageAttendance(3);

        gerencia.addClient( new Client("Armando", 33));
        gerencia.addClient( new Client("Bernardo", 33));
        gerencia.addClient( new Client("Carmem", 33));
        gerencia.addClient( new Client("Eliza", 22));

        System.out.println(gerencia.showQueues());

        Client c = gerencia.showNext();

        // c.setAge(44);

        System.out.println(gerencia.showQueues());

        System.out.println(gerencia.getNext());
        System.out.println(gerencia.getNext());
        System.out.println(gerencia.getNext());

    }
}
