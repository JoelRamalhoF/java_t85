import java.util.ArrayList;
import java.util.Scanner;

public class Ex01AtividadePratica {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		// criado a colection para vetoe do tipo integer
		ArrayList<Integer> vetor = new ArrayList<Integer>(5);
		
		int numero; //criado a variavel numero
		int soma = 0; //criado a variavel soma
		
		 
		System.out.println("*************** EXERCÍCIO 01 ATIVIDADE PRATICA  **************");
		
		// le o vetor e pede ao usuario para adicionar um numero inteiro
		for (int contador = 0; contador < 5 ; contador++) {
			;
			System.out.println("Digite o "+ (contador + 1)+ "º número inteiro: ");
			numero = leia.nextInt(); //armazena o numero
			vetor.add(numero);	//adiciona ao vetor
			soma += vetor.get(contador); //guarda na memoria para a soma
			
} 				//exibe os numeros digitados
		System.out.println("Números digitados: ");
		for (int contador = 0; contador < vetor.size(); contador++) {
			
		    System.out.printf("["+vetor.get(contador) + "]");
		}
		// colection max para exibir o maior valor de entrada
		int maior = java.util.Collections.max(vetor);
		float media = soma / vetor.size(); //criado uma variavel float para media
		
		// exibe na tela os dados solicitados como soma, media e maior valor
			System.out.println();
		    System.out.printf("A soma de todos números da Entrada é: %d\n", soma);
		    System.out.printf("A médiade todos números da Entrada é: %.1f\n", media);
		    System.out.printf("O maior Valor da Entrada é: %d\n", maior);
		

		leia.close();

	}
}

