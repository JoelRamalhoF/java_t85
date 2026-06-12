package aula_02_operadores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		
		System.out.print("\n Digite o valor do Salário Bruto :");
		salarioBruto = leia.nextFloat();
		
		System.out.print("\n Digite o valor do Adicional Noturno :");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("\n Digite o valor das Horas Extras :");
		horasExtras = leia.nextFloat();
		
		System.out.print("\n Digite o valor dos Descontos :");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("O Salário Líquido é: R$ %.2f", salarioLiquido);
		
		
		
		leia.close();

	}

}
