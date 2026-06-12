package aula_02_operadores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salario;
		float abono;
		float novoSalario;
		
		System.out.print("\nDigite o salário R$: ");
		
		salario = leia.nextFloat();
		
        System.out.print("\nDigite o abono R$: ");
		
		abono = leia.nextFloat();
		
		novoSalario = salario +abono;
		
		System.out.printf("\n %.2f + %.2f = %.2f", salario, abono, novoSalario);
		
		System.out.printf("\n Novo Salário R$: %.2f", novoSalario);
		
		leia.close();
	}

}
