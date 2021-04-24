public class AppLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        No no;

        System.out.println("Lista vazia? " + lista.estaVazia());


        no = new No(new Pessoa("Carlos", "111111"));
        lista.insereInicio(no);
        no = new No(new Pessoa("Marcos", "2222"));
        lista.insereInicio(no);

        System.out.println("Lista vazia? " + lista.estaVazia());
        System.out.println("Tamanho da lista: " + lista.getTamanho());
        System.out.println(lista.listarTodos());
        System.out.println("tel do Carlos: " + lista.buscarPorNome("Carlos"));
        System.out.println("tel do Andre: " + lista.buscarPorNome("Andre"));
        
        System.out.println();

        no = lista.removerDoInicio();
        System.out.println("Foi removido o " + no.getPessoa().getNome());
        System.out.println(lista.listarTodos());
        System.out.println("Tamanho: " + lista.getTamanho());

    }
}
