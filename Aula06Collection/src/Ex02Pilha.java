import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Ex02Pilha {
	
	public static void main(String[] args) {

        // criado uma pilha de livros, funcionando como se fosse uma fila
        Queue<String> pilha = new LinkedList<String>();

       
        int opcao;
        String nome;

        
        Scanner leia = new Scanner(System.in);

        // Laço de repeticao para o cliente escolher e depois repetir ate que 0 seja digitado
        do {
            System.out.println("**************************************");
            System.out.println("***     BEM VINDO(A) A BIBLIOTECA  ***");
            System.out.println("**************************************\n");

            System.out.println("**************************************");
            System.out.println("*** 1 - ADICIONAR LIVRO NA PILHA   ***");
            System.out.println("*** 2 - LISTAR TODOS OS LIVROS     ***");
            System.out.println("*** 3 - RETIRAR LIVRO DA PILHA     ***");
            System.out.println("***            0 - SAIR            ***");
            System.out.println("**************************************");
            System.out.println("ENTRE COM A OPÇÃO DESEJADA: ");

            // Le a opcao do menu
            opcao = leia.nextInt();
            leia.nextLine(); // limpa a entrada

            
			// faz a analise da opcao escolhida
            switch (opcao) {

                case 1:
                    // Adiciona novo livro na pilha
                    System.out.println("Digite o nome do livro: ");
                    nome = leia.nextLine();

                    pilha.add(nome);

                    System.out.println("Livro Adicionado!");
                    break;

                case 2:
                    // Lista todos os livros da pilha
                    if (pilha.isEmpty()) {
                        System.out.println("A Pilha de livros está vazia!");
                    } else {
                        System.out.println("Lista de Livros na Pilha:");
                        for (String livro : pilha) {
                            System.out.println(livro);
                        }
                    }
                    break;

                case 3:
                    // Retira  o primeiro livro da pilha
                    if (pilha.isEmpty()) {
                        System.out.println("A Pilha de livros está vazia!");
                    } else {
                        System.out.println("Um livro foi retirado da pilha: " + pilha.poll());
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
	

