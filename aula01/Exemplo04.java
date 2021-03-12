public class Exemplo04 {
    public static void main(String[] args) {
        
        int opcao;

        opcao = 4;

        switch (opcao) {
            case 1:
                System.out.println("Um");
                // break;
            case 2:
                System.out.println("Dois");
                break; 
            case 3:
                System.out.println("Dois");
                break;        
            default:
                System.out.println("Outro número");
        }
    }
}
