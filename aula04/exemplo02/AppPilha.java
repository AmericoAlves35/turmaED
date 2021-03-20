package exemplo02;

public class AppPilha {
    public static void main(String[] args) {
        Pilha p;
        p = new Pilha(3);

        System.out.println("Pilha vazia? " + p.estaVazia());
        System.out.println("Pilha cheia? " + p.estaCheia());
        
        p.empilhar(1);

        System.out.println("Pilha vazia? " + p.estaVazia());
        System.out.println("Pilha cheia? " + p.estaCheia());

        p.empilhar(2);
        p.empilhar(3);
        p.empilhar(4);

        System.out.println("Pilha vazia? " + p.estaVazia());
        System.out.println("Pilha cheia? " + p.estaCheia());
        System.out.println("Valor do topo = " + p.valorNoTopo());

        while(!p.estaVazia()) {
            System.out.println("Removeu: " + p.desempillhar());
        }
    }

}
