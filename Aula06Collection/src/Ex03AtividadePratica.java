import java.util.ArrayList;
import java.util.Scanner;

public class Ex03AtividadePratica {

	public static void main(String[] args) {
	
			
			Scanner leia = new Scanner(System.in);
			//criado as colections para produto (Tipo String) e quantidade do produto (Inteiro)
			ArrayList<String> produto = new ArrayList<String>();
			ArrayList<Integer> quantidadeProduto = new ArrayList<Integer>();
			
			
			char continuar = 'S'; //criado a variavel char que sera utilizada para confirmacao do usuario
			
			
	        
	          System.out.println("*************** EXERCÍCIO 03 ATIVIDADE PRATICA  **************");
	          System.out.println("***************    CONTROLE DE ESTOQUE          **************");
	          
	          
	          //do while para cadastrar produto, quantidade e confirmar se o usuario deseja continuar ou nao, quando digitado "s" o loop retorna
	          do {
	              System.out.println("Digite o nome do produto: ");
	              String nome = leia.nextLine();
	              produto.add(nome);

	              System.out.println("Atualizar  a quantidade do Produto: ");
	              int quantidade = leia.nextInt();
	              quantidadeProduto.add(quantidade);
	              
	              System.out.println("Deseja cadastrar outro produto? (S/N)");
	              continuar = leia.next().charAt(0);
	              
	              leia.nextLine(); 

	          } while (continuar == 'S' || continuar == 's');

	          System.out.println("\n*************** PRODUTOS CADASTRADOS ***************");
	          
	          		//exibe o nome do produto e a  quantidade de produtos 
	          for (int contador = 0; contador < produto.size(); contador++) {
	        	  
	              System.out.printf("\nProduto: %s ", produto.get(contador));
	              
	              System.out.printf("| Quantidade: %d ", quantidadeProduto.get(contador));
	              
	          
	          }

	        

	          leia.close();
	      }
	  }
	