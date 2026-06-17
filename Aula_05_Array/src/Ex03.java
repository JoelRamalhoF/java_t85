import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double matrizNotas[][] = new double[10][4];
		double media[] = new double[10];
		
		
		
		 
		
		for (int linha = 0; linha < matrizNotas.length; linha ++) {
			double soma = 0;
			
			for (int coluna = 0; coluna < matrizNotas[linha].length; coluna ++) {
				System.out.printf("INSIRA A NOTA DO ALUNO:  ");
				matrizNotas[linha][coluna] = leia.nextDouble();
				
				soma += matrizNotas[linha][coluna];
				
				}
		
		
			media[linha] = soma /4;
		}
			for (int mediaFinal = 0; mediaFinal < matrizNotas.length; mediaFinal++ ) {
		System.out.printf("A média final do aluno %d é de %.1f", mediaFinal, media[mediaFinal]);
		}
		
		
		
		leia.close();
		
		}
	}


