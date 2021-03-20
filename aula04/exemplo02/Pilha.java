package exemplo02;

public class Pilha { // MODELO
    // atributos - caracteristicas
    private int[] elementos;
    private int topo;

    // métodos - ações

    public Pilha(int tamanho) { // construtor inicializa o objeto
        elementos = new int[tamanho];
        topo = 0;
    }

    public void empilhar(int valor) { // push; public posso usar fora da classe; void sem retorno
        if (!estaCheia()) {
            elementos[topo] = valor;
            topo++;
        }
    }

    public int desempillhar() {
        if (!estaVazia()) {
            topo--;
            return elementos[topo];
        }
        return -1;
    }

    public boolean estaVazia() { // isEmpty()
        /*
         * if( topo == 0) { return true; } else{ return false; }
         */
        return (topo == 0);
    }

    public boolean estaCheia() {
        return (topo == elementos.length);
    }

    public int valorNoTopo() { // peek()
        if (estaVazia()) {
            return -1;
        }
        return elementos[topo - 1];
    }

    public int numElementos() { // size()
        return topo;
    }

}
