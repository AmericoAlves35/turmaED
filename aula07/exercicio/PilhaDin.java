package exercicio;

public class PilhaDin {
    private No topo;
    private int tamanho;

    public PilhaDin() {
        topo = null;
        tamanho = 0;
    }

    public void empilhar(char valor) {
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

    public char desempillhar() {
        if (!estaVazia()) {
            char valor = topo.getValor();
            topo = topo.getProximo(); // move o TOPO para o próximo NO (ou null)
            tamanho--;
            return valor;
        }
        return '#';
    }

    @Override
    public String toString() {
        String valores = "[ ";
        No aux = topo;

        if(aux != null) {
            valores += aux.getValor();
            aux = aux.getProximo();
        }
        while(aux != null) { // enquanto não chegar no final da Pilha
            valores += ", " + aux.getValor();
            aux = aux.getProximo(); // vai para o próximo No
        }

        valores += " ]";
        return valores;
    }

    public String exibir() {
        String valores = "[ ";
        No aux = topo;

        while(aux != null) { // enquanto não chegar no final da Pilha
            valores += aux.getValor();
            aux = aux.getProximo(); // vai para o próximo No
            if(aux != null) { // se tiver outro No
                valores += ", ";
            }
        }

        valores += " ]";
        return valores;
    }
    
}
