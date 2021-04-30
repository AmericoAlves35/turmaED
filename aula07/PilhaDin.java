public class PilhaDin {
    private No topo;
    private int tamanho;

    public PilhaDin() {
        topo = null;
        tamanho = 0;
    }

    public void empilhar(int valor) {
        No novo = new No(valor); // cria um novo No
        novo.setProximo(topo); // aponta o próximo do novo No, para o No que está no TOPO da Pilha
        topo = novo; // indica que o novo No agora é o primeiro, ou seja, o novo TOPO da  Pilha
        tamanho++;
    }

    public boolean estaVazia() {
        return (topo == null);
    }

    public int getTamanho() {
        return tamanho;
    }

    public int valorNoTopo() { 
        if (estaVazia()) {
            return -1;
        }
        return topo.getValor();
    }

    public int desempillhar() {
        if (!estaVazia()) {
            int valor = topo.getValor();
            topo = topo.getProximo(); // move o TOPO para o próximo NO (ou null)
            tamanho--;
            return valor;
        }
        return -1;
    }

    
    
}
