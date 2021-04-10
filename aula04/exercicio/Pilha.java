package exercicio;

public class Pilha { // MODELO
    // atributos - caracteristicas
    private char[] elementos;
    private int topo;

    // métodos - ações

    public Pilha(int tamanho) { // construtor inicializa o objeto
        elementos = new char[tamanho];
        topo = 0;
    }

    public void empilhar(char valor) { // push; public posso usar fora da classe; void sem retorno
        if (!estaCheia()) {
            elementos[topo] = valor;
            topo++;
        }
    }

    public char desempillhar() {
        if (!estaVazia()) {
            topo--;
            return elementos[topo];
        }
        return '@';
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

    public char valorNoTopo() { // peek()
        if (estaVazia()) {
            return '@';
        }
        return elementos[topo - 1];
    }

    public int numElementos() { // size()
        return topo;
    }

}
