public class App {
    public static void main(String[] args) {
        PilhaDin p = new PilhaDin();

        System.out.println("Vazia? " + p.estaVazia());

        p.empilhar(10);
        p.empilhar(20);

        System.out.println("Vazia? " + p.estaVazia());
        System.out.println("# elementos: " + p.getTamanho());
        System.out.println("Valor no topo: " + p.valorNoTopo());

        System.out.println("\nRemovou o valor " + p.desempillhar());
        System.out.println("# elementos: " + p.getTamanho());
        System.out.println("Valor no topo: " + p.valorNoTopo());

    }
}
