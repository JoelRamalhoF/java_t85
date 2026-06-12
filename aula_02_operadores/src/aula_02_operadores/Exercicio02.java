package aula_02_operadores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float mediaFinal;
		
		
        System.out.print("\nDigite a Primeira Nota: ");
		
		nota1 = leia.nextFloat();
		
         System.out.print("\nDigite a Segunda Nota: ");
			
			nota2 = leia.nextFloat();
			
        System.out.print("\nDigite a Terceira Nota: ");
			
			nota3 = leia.nextFloat();
		
		System.out.print("\nDigite a Quarta Nota: ");
				
				nota4 = leia.nextFloat();
				
		mediaFinal = ((nota1 + nota2 + nota3 + nota4) / 4);
		
		System.out.printf("A Média Final é: %.2f", mediaFinal);
		
		leia.close();
				
				
	}

}
