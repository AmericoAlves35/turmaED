import model.Client;
import util.Queue;

public class ManageAttendance {
    private final int MAX_SIZE = 50;
    private Queue normal, priority;
    private int maxSize;
    private int nextCli;

    public ManageAttendance(int size) {
        normal = new Queue();
        priority = new Queue();
        if (size > 0) {
            this.maxSize = size;
        } else {
            maxSize = MAX_SIZE;
        }
        nextCli = 0;
    }

    public boolean isEmpty() {
        return normal.isEmpty() && priority.isEmpty();
    }

    public int numClients() {
        return normal.getSize() + priority.getSize();
    }

    public int numElderlyClients() {
        return priority.getSize();
    }

    public boolean isFull() {
        return normal.getSize() + priority.getSize() == maxSize;
    }

    public boolean addClient(Client cli) {
        if (isFull()) {
            return false;
        }
        if (cli.isElderly()) {
            priority.enqueue(cli);
        } else {
            normal.enqueue(cli);
        }
        return true;
    }

    public Client showNext() {
        if (nextCli < 2) {
            if (!priority.isEmpty())
                return priority.peek();
        }
        return normal.peek();
    }

    public Client getNext() {
        if (nextCli < 2) {
            if (!priority.isEmpty()) {
                nextCli = (nextCli + 1) % 3;
                return priority.dequeue();
            }
        }
        if(!normal.isEmpty()) {
            nextCli = 0;
            return normal.dequeue();
        }
        nextCli = (nextCli + 1) % 3;
        return priority.dequeue();
    }

    public String showQueues( ) {
        return "idoso:" + priority.show() + ";normal:" + normal.show();
    }

}
