public class AppArvore {
    public static void main(String[] args) {
        ArvoreBB arvore = new ArvoreBB();

        arvore.inserir(5);
        arvore.inserir(4);
        arvore.inserir(8);
        arvore.inserir(2);
        arvore.inserir(5);
        arvore.inserir(10);

        No entrado = arvore.busca(4);
        if(entrado != null ) {
            System.out.println("Achei: " + entrado.getDado());
        } else {
            System.out.println("Valor não está na árvore");
        }
        
        entrado = arvore.busca(14);
        if(entrado != null ) {
            System.out.println("Achei: " + entrado.getDado());
        } else {
            System.out.println("Valor não está na árvore");
        }

    }
}
