package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int codigo;
		float salario;
	
		
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		
		System.out.println("******************************************************************");
		System.out.println("                       ESCOLHA SEU PEDIDO                         ");
		System.out.println("******************************************************************");
		System.out.println("              1 - Gerente                                         ");
		System.out.println("              2 - Vendedor                                        ");
		System.out.println("              3 - Supervisor                                      ");
		System.out.println("              4 - Motorista                                       ");
		System.out.println("              5 - Estoquista                                      ");
		System.out.println("              6 - Técnico de TI                                   ");
		System.out.println("                                                                  ");
		System.out.println("******************************************************************");

		System.out.println("Escolha seu pedido: ");
		codigo = leia.nextInt();
		
		
		System.out.println("Digite seu salário ");
		salario = leia.nextFloat();
		
		double novoSalario1 = salario + (salario * 0.1);
		double novoSalario2 = salario + (salario * 0.07);
		double novoSalario3 = salario + (salario * 0.09);
		double novoSalario4 = salario + (salario * 0.06);
		double novoSalario5 = salario + (salario * 0.08);

		switch(codigo)  {
		case 1:
		    System.out.println("Olá : " + nome);
		    System.out.println("Seu Cargo é: Gerente");
		    System.out.printf("Salário: R$ %.2f", novoSalario1);
		    break;

		case 2:
		    System.out.println("Olá : " + nome);
		    System.out.println("Seu Cargo é: Vendedor");
		    System.out.printf("Salário: R$ %.2f", novoSalario2);
		    break;

		case 3:
		    System.out.println("Olá : " + nome);
		    System.out.println("Seu Cargo é: Supervisor");
		    System.out.printf("Salário: R$ %.2f", novoSalario3);
		    break;

		case 4:
		    System.out.println("Olá : " + nome);
		    System.out.println("Seu Cargo é: Motorista");
		    System.out.printf("Salário: R$ %.2f", novoSalario4);
		    break;

		case 5:
		    System.out.println("Olá : " + nome);
		    System.out.println("Seu Cargo é: Estoquista");
		    System.out.printf("Salário: R$ %.2f", novoSalario5);
		    break;

		case 6:
		    System.out.println("Olá : " + nome);
		    System.out.println("Seu Cargo é: Técnico de TI");
		    System.out.printf("Salário: R$ %.2f", novoSalario5);
		    break;

		default:
		    System.out.println("Opção Inválida!");
		}
      leia.close();
	}

	}


