
public class ArvoreBB {
    private No raiz;


    public ArvoreBB() {
        raiz = null;
    }

    public boolean estaVazia() {
        return raiz == null;
    }

    public boolean inserir(int valor) {
        No novo = new No(valor);

        if(estaVazia()){
            raiz = novo;
            return true;
        }

        No aux = raiz;
        No anterior;

        do{
            anterior = aux;
            if(aux.getValor() == valor){
                return false;
            }
            if(aux.getValor() > valor) {
                aux = aux.getEsq();
                if( aux == null ) {
                    anterior.setEsq(novo);
                }
            } else {
                aux = aux.getDir();
                if( aux == null ) {
                    anterior.setDir(novo);
                }
            }

        } while(aux != null );
        return true;
    }

    public No busca(int valor) {
        if(estaVazia()) return null;

        No aux = raiz;

        while(aux != null) {
            if(aux.getDado() == valor) {
                return new No(aux.getDado());
            }
            if(aux.getDado() > valor){
                aux = aux.getEsq();
            } else {
                aux = aux.getDir();
            }
        }
        return null;
    }

}
