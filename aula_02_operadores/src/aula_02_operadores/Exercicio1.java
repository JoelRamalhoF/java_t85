package aula_02_operadores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double salario;
		double abono;
		double novoSalario;
		
		System.out.print("\nDigite o salário R$: ");
		
		salario = leia.nextDouble();
		
        System.out.print("\nDigite o abono R$: ");
		
		abono = leia.nextDouble();
		
		novoSalario = salario +abono;
		
		System.out.printf("\n %.2f + %.2f = %.2f", salario, abono, novoSalario);
		
		System.out.printf("\n Novo Salário R$: %.2f", novoSalario);
		
		leia.close();
	}

}
