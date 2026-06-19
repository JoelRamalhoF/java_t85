import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01CollectionQueue {

    public static void main(String[] args) {

        // criando uma fila de clientes
        Queue<String> fila = new LinkedList<String>();

        // Variáveis 
        int opcao;
        String nome;

        
        Scanner leia = new Scanner(System.in);

        // Laço de repeticao para o cliente escolher e depois repetir ate que 0 seja digitado
        do {
            System.out.println("**************************************");
            System.out.println("*** BEM VINDO(A) AO BANCO DA PRAÇA ***");
            System.out.println("**************************************\n");

            System.out.println("**************************************");
            System.out.println("*** 1 - ADICIONAR CLIENTE NA FILA  ***");
            System.out.println("*** 2 - LISTAR TODOS OS CLIENTES   ***");
            System.out.println("*** 3 - RETIRAR CLIENTE DA FILA    ***");
            System.out.println("***            0 - SAIR            ***");
            System.out.println("**************************************");
            System.out.println("ENTRE COM A OPÇÃO DESEJADA: ");

            // Le a opcao do menu
            opcao = leia.nextInt();
            leia.nextLine(); // limpa o ENTER do teclado

            // faz a analise da opcao escolhida
            switch (opcao) {

                case 1:
                    // Adiciona novo cliente na fila
                    System.out.println("Digite o nome do cliente: ");
                    nome = leia.nextLine();

                    fila.add(nome);

                    System.out.println("Cliente Adicionado!");
                    break;

                case 2:
                    // Lista todos os clientes da fila
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        System.out.println("Lista de Clientes na Fila:");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 3:
                    // Retira  o primeiro cliente da fila
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        System.out.println("Cliente chamado: " + fila.poll());
                    }
                    break;

                case 0:
                    // Caso digite 0 o programa e encerrado
                    System.out.println("Programa finalizado.");
                    break;

                default:    //se o usuario digitar uma opcao invalida
                    
                    System.out.println("Opção inválida!");
            }

            System.out.println(); // só para pular linha e deixar o menu mais organizado

        } while (opcao != 0); // repete enquanto a opção for diferente de 0

        leia.close();
    }
}