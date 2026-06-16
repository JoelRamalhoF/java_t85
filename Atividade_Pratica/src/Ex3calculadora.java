import java.util.Scanner;

public class Ex3calculadora {

	public static void main(String[] args) {
		
		// Criado a classe Scanner
		Scanner leia = new Scanner(System.in);
		
		//variaveis do tipo double para receber os valores, por se tratar de uma calculadora pode ser o valor fracionado 
		double n1; 
		double n2;
		int operacao; // como é uma operacao de escolha de numeros inteiros, foi utilizada a variavel int
		double soma;
		double subtracao;
		double multiplicacao;
		double divisao;
		
		//O sistema pede o Primeiro e Segundo numero e guarda na memoria.
		System.out.println("Digite o Primeiro número: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o Segundo número: ");
		n2 = leia.nextDouble();
		
		//O programa ira exibir uma lista de operações a ser escolhida pelo usuário.
		System.out.println("******************************************************************");
		System.out.println("                      OPERAÇÕES                                   ");
		System.out.println("******************************************************************");
		System.out.println("              1 - SOMA                                            ");
		System.out.println("              2 - SUBTRAÇÃO                                       ");
		System.out.println("              3 - MULTIPLICAÇÃO                                   ");
		System.out.println("              4 - DIVISÃO                                         ");
		System.out.println("******************************************************************");
		
		
		// O sistema recebe o valor digitado da operacao desejada
		System.out.println("Escolha uma opção de 1 a 4 ");
		operacao = leia.nextInt();
		
		// declarado a operacao de cada variavel
	    soma = n1 + n2;
		subtracao = n1 - n2;
		multiplicacao = n1 * n2;
	    divisao = n1 / n2;
		
	    //Obs: Como é um sistema de calculadora, optei por não utilizar limite de casas decimais
	    
		switch(operacao)  {
		//Caso 1 onde a operaçao é uma soma, retorna o valor de "soma"
		case 1:
		    System.out.printf("Operação: Soma\n Resultado: %f", soma);
		    
		    break;
		    
		  //Caso 2 onde a operaçao é uma subtracao, retorna o valor de "subtracao"
		case 2:
			
		    System.out.printf("Operação: Subtração\n Resultado: %f", subtracao);
		    
		    break;
		    
		  //Caso 3 onde a operaçao é uma multiplicacao, retorna o valor de "multipliacacao"
		case 3:
			
		    System.out.printf("Operação: Multipliacação\n Resultado: %f", multiplicacao);
		    
		    break;
		    
		    //Caso 4 onde a operaçao é uma divisao, retorna o valor de "divisao"
		case 4:
			if (n2 != 0) {
		    System.out.printf("Operação: Divisão\n Resultado: %f", divisao);
			}else {
				System.out.println("Não existe divisão por zero!");
			}
		    break;
		    
		    //Se nao houver nenhuma opcao digitada valia, o codigo retorna "Opção invalida!"
		default:
			System.out.println("Opção Inválida!");
		
		}
		

	}

}
