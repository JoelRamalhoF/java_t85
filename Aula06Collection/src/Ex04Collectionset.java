import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04Collectionset {
	

		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			//set integer, pegando todos numeros do exercicio e armazenando
			Set<Integer> numeros = new HashSet<Integer>();
			numeros.add(2);
			numeros.add(5);
			numeros.add(1);
			numeros.add(3);
			numeros.add(4);
			numeros.add(9);
			numeros.add(7);
			numeros.add(8);
			numeros.add(10);
			numeros.add(6);

			int numero;
	 
			//mensagem para o usuario digitar um numero inteiro e guardar na memoria
			System.out.println("Digite um Número Inteiro que deseja encontrar: ");
			numero = leia.nextInt(); 
			
			// condicao, se encontrar exibe numero encontrado, senao numero nao encontrado
			
			if (numeros.contains(numero)) {
			    System.out.printf("O número %d foi encontrado!%n", numero);
			} else {
			    System.out.printf("O número %d não foi encontrado!%n", numero);
			}
			
			leia.close();
		
		


	}

}
