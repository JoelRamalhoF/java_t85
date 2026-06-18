import java.util.Scanner;

public class Ex04Collectionset {
	

		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			// Vetor inicializado com dados
			int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
			int numero;
			boolean encontrado = false; /* decidi criar um boolean pois tentei com if e else e tava dando muitos erros na hora de exibir a mensagem 
			                                 de numero nao foi encontrado*/

			
	 
			
			System.out.println("Digite um Número Inteiro que deseja encontrar: ");
			numero = leia.nextInt();  // le o numero digitado e armazena na memoria
			
			//criado um laco for para percorrer as posicoes do vetor
			for (int posicao = 0; posicao < vetorInteiros.length; posicao++) {
				
				/* se o usuario digitar o numero que se encaixa em uma posicao, a mensagem ira exibir o numero digitado 
				 e a posicao referente a aquele numero */
				
				if (vetorInteiros[posicao] == numero) {
				System.out.printf("O número %d esta na posição = %d\n", numero, posicao);
				encontrado = true; //se atender a condicao de numero encontrado, o valor boolean muda para true e nao exibe a mensagem de numero nao encontrado
			}
				}
			if (encontrado == false) //caso o numero nao seja encontrado na condicao acima, ele entende que boolean continua false e exibe a mensagem
				System.out.printf("O número %d NÃO FOI ENCONTRADO", numero);
			
			leia.close();
		
		


	}

}
