import java.util.ArrayList;
import java.util.Scanner;

public class Ex01AtividadePratica {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> vetor = new ArrayList<Integer>(5);
		
		int numero;
		int soma = 0;
		
		 
		System.out.println("*************** EXERCÍCIO 01 ATIVIDADE PRATICA  **************");
		
		
		for (int contador = 0; contador < 5 ; contador++) {
			;
			System.out.println("Digite o "+ (contador + 1)+ "º número inteiro: ");
			numero = leia.nextInt();
			vetor.add(numero);	
			soma += vetor.get(contador);
			
}
		for (int contador = 0; contador < vetor.size(); contador++) {
			
		    System.out.printf("["+vetor.get(contador) + "]");
		}
		int maior = java.util.Collections.max(vetor);
		float media = soma / vetor.size();
		
		
			System.out.println();
		    System.out.printf("A soma de todos números da Entrada é: %d\n", soma);
		    
		    System.out.printf("A médiade todos números da Entrada é: %.1f\n", media);
		    System.out.printf("O maior Valor da Entrada é: %d\n", maior);
		

		leia.close();

	}
}

