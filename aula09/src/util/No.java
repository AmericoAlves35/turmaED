package util;

import model.Client;

public class No {
    private Client client;
    private No prox;

    public No(Client client) {
        this.client = client;
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
