
public class No {
    private int dado;
    private No esq;
    private No dir;

    public No(int dado) {
        this.dado = dado;
        esq = null;
        dir = null;
    }

    public int getValor() {
        return dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    
}
