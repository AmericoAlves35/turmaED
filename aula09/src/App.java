import java.util.Scanner;

import model.Client;

public class App {
    public static void main(String[] args) {
        ManageAttendance gerencia = new ManageAttendance(3);
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        int menuOption;

        do {
            System.out.println("1 – Chegada de cliente");
            System.out.println("2 – Verificar quem é o próximo");
            System.out.println("3 – Atender um cliente");
            System.out.println("4 – Exibir as filas");
            System.out.println("5 – Finalizar o programa");
            menuOption = Integer.parseInt(input.nextLine());

            switch (menuOption) {
                case 1:
                    // Este teste feito no início evita digitar e só depois saber que a fila está cheia
                    if (gerencia.isFull()) {
                        System.out.println("\nNão é possível cadastrar. Agencia Cheia");
                        break;
                    }
                    System.out.print("\nInforme o nome: ");
                    nome = input.nextLine();
                    System.out.print("Informe a idade:");
                    idade = Integer.parseInt(input.nextLine());

                    // Essa verificação não é necessária, mas deixei para mostrar como pode ser validado
                    if (gerencia.addClient(new Client(nome, idade))) {
                        System.out.println("\nCliente entrou na fila");
                    } else {
                        System.out.println("\nNão é possível cadastrar. Agencia Cheia");
                    }
                    break;

                case 2:
                    if (gerencia.isEmpty()) {
                        System.out.println("\nFila vazia");
                    } else {
                        System.out.println("\nPróximo: " + gerencia.showNext());
                    }
                    break;

                case 3:
                    if (gerencia.isEmpty()) {
                        System.out.println("\nFila vazia");
                    } else {
                        System.out.println("\nAtentendo: " + gerencia.getNext());
                    }
                    break;

                case 4:
                    System.out.println("\nFilas: " + gerencia.showQueues());
                    break;

                case 5:
                    if (!gerencia.isEmpty()) {
                        System.out.println("\nSomente pode terminar depois de atender todos os clientes.");
                        menuOption = 0;
                    }
                    break;

                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }
        } while (menuOption != 5);
        
        input.close();
    }
}
