package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valorA;
		int valorB;
		int valorC;
		int soma;
		
		System.out.println("Digite o valor de A: ");
		valorA = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		valorB = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		valorC = leia.nextInt();
		
		
		soma = valorA + valorB;
		

		
		if (soma > valorC) {
		System.out.printf("%d + %d = %d > %d\n", valorA, valorB, soma, valorC);
		System.out.println("O valor da soma A + B é maior que C");
		
		} else if (soma < valorC) {
		System.out.printf("%d + %d = %d < %d\n", valorA, valorB, soma, valorC);
		System.out.println("O valor da soma  é A + B menor que  C");
		} else {
			System.out.printf("%d + %d = %d < %d\n", valorA, valorB, soma, valorC);
				System.out.println("\n O valor da soma de A + B é igual a C");
				
		}
	}

}
