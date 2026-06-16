import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, esporte, totalRespostas = 0, somaIdade = 0, futebol = 0, voleiM18 = 0;
		double mediaIdades = 0.0;
		char continua = 'S';
				
		while(continua =='S') {
			
							System.out.println("******************************");
							System.out.println("**PESQUISA ESPORTE FAVORITO***");
							System.out.println("******************************");
							
							System.out.print("Digite Sua Idade: ");
							
							idade = leia.nextInt();
			
			
			do {
				System.out.println("*ESCOLHA SEU ESPORTE FAVORITO: *");
				System.out.println("1 - FUTEBOL" );
				System.out.println("2 - VOLEIBOL");
				System.out.println("3 - BASQUETEBOL");
				System.out.println("4 - OUTROS");
			
		
				esporte = leia.nextInt();
			}while(esporte > 4|| esporte < 1);
			
			/* Estatísticas */
			
			
			// Total de pessoas que responderam a pesquisa
			
			totalRespostas ++;
			
			//Soma total das idades de todas as pessoas que responderam
			somaIdade += idade;
			
			// Total de pessoas que gostam de futebol
			if(esporte == 1)
				futebol ++;
			
			// Total de pessoas que gostam de voleibol e sao maiores de 18 anos
			if(idade > 18 && esporte == 2);
			voleiM18 ++;
				
			
			do {
				System.out.println("DESEJA CONTINUAR? (S/N)");
				continua = leia.next().toUpperCase().charAt(0);
			}while(!(continua == 'S') && !(continua == 'N'));	
				}
			
		mediaIdades = somaIdade / totalRespostas;
		
		System.out.printf("TOTAL DE PESSOAS MAIORES DE 18 ANOS E QUE GOSTAM DE FUTEBOL: %d\n", futebol);
		System.out.printf("TOTAL DE PESSOAS MAIORES DE 18 ANOS E QUE GOSTAM DE VOLEIBOL %d\n", voleiM18);
		System.out.printf("MÉDIA DAS IDADES: %.2f\n", mediaIdades);
		
		leia.close();

	}

}
