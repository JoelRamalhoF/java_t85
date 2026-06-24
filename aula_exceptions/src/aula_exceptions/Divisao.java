package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;
		
	do {	
			try {
			System.out.println("Digite o Dividendo: ");
			dividendo = ler.nextInt();
					
			System.out.println("Digite o Divisor: ");
			divisor = ler.nextInt();
					
			divide(dividendo, divisor);
			
			loop = false;
			
			} catch(InputMismatchException error) {
			
			System.err.println("Erro de digitação " + error.getMessage());
			ler.nextLine(); //para sair do loop
			
			} catch (ArithmeticException error) {
			System.err.println("Erro de cálculo " + error.getMessage());
			ler.nextLine();
			} finally { //somente se quiser que aparece uma mensagem ao usuario
			System.out.println("Obrigado");
						}
		
			}while(loop);
	
		}
	
	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
