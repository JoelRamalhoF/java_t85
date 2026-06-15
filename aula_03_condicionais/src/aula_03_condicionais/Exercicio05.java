package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
			
			Scanner leia = new Scanner(System.in);
			
		
			int codigo;
			int quantidade;
			int valor;
			
			
			System.out.println("******************************************************************");
			System.out.println("                       ESCOLHA SEU PEDIDO                         ");
			System.out.println("******************************************************************");
			System.out.println("              1 - Cachorro Quente   |   R$ 10,00 UN               ");
			System.out.println("              2 - X-Salada          |   R$ 15,00 UN               ");
			System.out.println("              3 - X-Bacon           |   R$ 18,00 UN               ");
			System.out.println("              4 - Bauru             |   R$ 12,00 UN               ");
			System.out.println("              5 - Refrigerante      |   R$ 08,00 UN               ");
			System.out.println("              6 - Suco de laranja   |   R$ 13,00 UN               ");
			System.out.println("                                                                  ");
			System.out.println("******************************************************************");

			System.out.println("Escolha seu pedido: ");
			codigo = leia.nextInt();
			
			System.out.println("Escolha a quantidade: ");
			quantidade = leia.nextInt();
			
			
			
			switch(codigo) {
			case 1:
				System.out.println("Você Selecionou "+quantidade+" Cachorro(s) Quente(s)\n");
				System.out.printf("O Valor total é de R$ :%d,00", (quantidade*10));
			break;	
			
			case 2:
				System.out.println("Você Selecionou "+quantidade+" X- Salada(s)\n");
				System.out.printf("O Valor total é de R$ :%d,00", (quantidade*15));
			break;
			
			case 3:
				System.out.println("Você Selecionou "+quantidade+" X- Bacon(s)\n");
				System.out.printf("O Valor total é de R$ :%d,00", (quantidade*18));
			break;
				
			case 4:
				System.out.println("Você Selecionou "+quantidade+" Bauru(s)\n");
				System.out.printf("O Valor total é de R$ :%d,00", (quantidade*12));
			break;
				
			case 5:
				System.out.println("Você Selecionou "+quantidade+" Refrigerante(s)\n");
				System.out.printf("O Valor total é de R$ :%d,00", (quantidade*8));
			break;
				
			case 6:
				System.out.println("Você Selecionou "+quantidade+" Suco(s) de Laranja\n");
				System.out.printf("O Valor total é de R$ :%d,00", (quantidade*13));
			break;
			default:
				System.out.println("Opção Inválida!");
				
			
				leia.close();
			}
			
			}
	}


