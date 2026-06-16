import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int numero;
		int pares = 0;
		int impares = 0;
		
		
		
		
		for(int i = 1; i <= 10; i++) {       
			System.out.printf("Digite o "+i+"º Número\n", i);
			numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			pares++;
		}else {
			impares++;
		}
		}
		
		System.out.printf("\nTotal de números Pares: %d\n", pares);
		System.out.printf("\nTotal de números Impares: %d\n", impares);
		
		leia.close();
	}

	}
	
