package aula_11_lambda;

import java.util.Arrays;
import java.util.List;

public class ExemplosLambda {

	public static void main(String[] args) {
		
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		/*
		 * Método antigo (for)
		 * for (var numero : numeros) {
			System.out.println(numero);
		}*/
		
		/* numeros = colecao, numero variavel
		/ Para adicionar outros comandos, coloca chave depois da seta nao esquecer de fechar
		 * 
		 */
		
		// Exemplo 1 simples
		numeros.forEach(numero -> System.out.println(numero));
		
		//Exemplo 2 mais de 1 comando
		
		System.out.println("Os números são: ");
		numeros.forEach(numero ->{
			System.out.println(numero);
			System.out.println(numero +1);
			});
		
		// Exemplo 3 imprimindo numeros pares
		numeros.forEach(numero -> {
			if (numero % 2 == 0)
				System.out.println(numero);
		});
		
	}

}
