import java.util.Stack;

public class Exemplo01 {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>(); 

        pilha.push("Um");
        pilha.push("Dois");
        pilha.push("Três");
        pilha.push("Quatro");

        System.out.println("Número de elementos na pilha: " + pilha.size());  // quantos elementos estão na pilha
        System.out.println("Nome no topo: " + pilha.peek()); // elemento que está no TOPO da pilha

        while(!pilha.isEmpty()) {
            String resp = pilha.pop();
            System.out.print( resp + " ");
        }

    }
    
}