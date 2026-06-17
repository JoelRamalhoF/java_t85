import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Vetor inicializado com dados
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero;
		boolean encontrado = false;

		
 
		System.out.println("***************** EXERCÍCIO 01 DA LISTA VETORES ************* ");
		System.out.println("Digite um Número Inteiro que deseja encontrar: ");
		numero = leia.nextInt();
		
		for (int posicao = 0; posicao < vetorInteiros.length; posicao++) {
			
			
			if (vetorInteiros[posicao] == numero) {
			System.out.printf("O número %d esta na posição = %d\n", numero, posicao);
			encontrado = true;
		}
			}
		if (encontrado == false)
			System.out.printf("O número %d NÃO FOI ENCONTRADO", numero);
		
		leia.close();
 
		
		}
	}
	

