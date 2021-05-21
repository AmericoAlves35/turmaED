public class No {
    private Client client;
    private No prox;

    public No(String name, int age) {
        client = new Client(name, age);
        prox = null;
    }

    public Client getClient() {
        return client;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
