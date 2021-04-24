public class Lista {
    private No inicio;
    private int tamanho;

    public Lista() {
        inicio = null;
        tamanho = 0;
    }

    // verificar se a lista está vazia
    public boolean estaVazia() {
        return (inicio == null);
    }

    // inserir no início da lista
    public void insereInicio(No novoNo) {
        //apontar o próximo do 'novoNo' para o 'inicio' da lista
        novoNo.setProximo(inicio);
        //aponta o primeiro para o novoNo
        inicio = novoNo;
        tamanho++;
    }

    // exibir a lista
    public String listarTodos() {
        String saida = "Lista: ";
        No aux;

        aux = inicio; // comea do iníci0 da lista
        while( aux != null) {
            saida = saida + aux.getPessoa().getNome() + ", ";
            aux = aux.getProximo(); // move o auxiliar para o próximo Nó da lista
        }

        return saida;
    }

    // tamanho da lista
    public int getTamanho() {
        return tamanho;
    }

    // procurar na lista
    public String buscarPorNome(String nome) {
        No aux = inicio;
        while( aux != null) {
            if(aux.getPessoa().getNome().equals(nome)){
                return aux.getPessoa().getTelefone();
            }
            aux = aux.getProximo();
        }
        return "Não encontrado";
    }

    // remover do início da lista
    public No removerDoInicio() {
        // verificar se não está vazia
        if(estaVazia()) {
            return null;
        }
        No aux = inicio; // guarda o primeiro Nó
        // apontar o inicio da 'lista' para o próximo Nó, do Nó inicial
        inicio = inicio.getProximo();
        // apontar o próximo do nó removido para null
        aux.setProximo(null);
        tamanho--;
        // retornar o Nó removido
        return aux;
    }
}
