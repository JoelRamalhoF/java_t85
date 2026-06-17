import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
			
			Scanner leia = new Scanner(System.in);
			
			double matrizNotas[][] = new double[10][4]; //cria a matriz com 10 linhas e 4 colunas (Fiz com 1 linha e 4 colunas primeiro para testar, depois mudei para 10 linhas)
			double media[] = new double[10];            //cria a variavel media para o valor de 10 linhas
			
			
			
			 
			System.out.println("*************** EXERCÍCIO 04 DA LISTA MATRIZES  **************");
			
			//Percorre as linhas da matriz com o laço for, cada linha representando um aluno
			for (int linha = 0; linha < matrizNotas.length; linha ++) {
				
				// para cada linha ele cria uma variavel de soma com valor inicial 0
				double soma = 0;
				
				// Criado outro laço for dentro do primeiro, para percorrer as colunas
				for (int coluna = 0; coluna < matrizNotas[linha].length; coluna ++) {
					
					// pede ao usuario para inserir os valores e armazena em cada posicao linha/coluna
					System.out.printf("INSIRA A NOTA DO ALUNO:  ");
					matrizNotas[linha][coluna] = leia.nextDouble();
					
					soma += matrizNotas[linha][coluna]; //adiciona as 4 notas de cada aluno a soma
					
					}
			
			// calcula a media do aluno com valor das 4 notas somadas dividindo por 4
				media[linha] = soma /4;
			}
			// criado outro laco for para mostrar na tela a media de cada aluno, onde cada posicao da coluna representa uma media de aluno
				for (int mediaFinal = 0; mediaFinal < matrizNotas.length; mediaFinal++ ) {
			System.out.printf("\nA média final do aluno %d é de %.1f\n", mediaFinal, media[mediaFinal]);
			}
			
			
			
			leia.close();
			
			}
		}
