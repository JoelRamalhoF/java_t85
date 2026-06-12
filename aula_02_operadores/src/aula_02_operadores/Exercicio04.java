package aula_02_operadores;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1;
		float n2;
		float n3;
		float n4;
		float diferenca;
		
		
		
		System.out.print("\nDigite o Primeiro Valor");
		n1 = leia.nextFloat();
		
		System.out.print("\nDigite o Segundo Valor");
		n2 = leia.nextFloat();
		
		System.out.print("\nDigite o Terceiro Valor");
		n3 = leia.nextFloat();
		
		System.out.print("\nDigite o Quarto Valor");
		n4 = leia.nextFloat();
		
		
		diferenca = (n1*n2)-(n3*n4);
		
		System.out.printf("A diferença é de: %.2f", diferenca);
		
		leia.close();
		
		
	}

}
