import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, identidade, desenvolvedor, homem = 0, mulher = 0,naoB = 0, genero, totalPessoas = 0, mAcima = 0, hAcima = 0;
		int backEnd, frontEnd, mobile, fullStack, somaIdade = 0;
		char continua = 'S';
		double mediaIdades = 0.0;
		
		while(continua =='S') {
			
			System.out.println("\n*******************************");
			System.out.println("***  PESQUISA DE PROFISSÃO  ***");
			System.out.println("*******************************\n");
			
			System.out.print("Digite Sua Idade: ");
			
			idade = leia.nextInt();


			do {
				System.out.println("*ESCOLHA SEU GENERO: *");
				System.out.println("1 - Mulher Cis" );
				System.out.println("2 - HOMEM CIS");
				System.out.println("3 - NAO BINARIO");
				System.out.println("4 - MULHER TRANS");
				System.out.println("5 - HOMEM TRANS");
				System.out.println("6 - OUTROS");
			
		
				genero = leia.nextInt();
			}while(genero > 6|| genero < 1);
			
			totalPessoas ++;
			
			//Quantidade de mulheres cis e trans
			if(genero == 1 || genero == 4)
				mulher ++;
			
			//Quantidade de homens cis e trans
			if(genero == 2 || genero == 5)
				homem ++;
			
			//Quantidade de NAO BINARIOS
			if(genero == 3)
				naoB ++;
			
			//O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
			if(idade > 40 && (genero == 2 || genero == 5));
			hAcima ++;
				
			
			do {
				System.out.println("DESEJA CONTINUAR? (S/N)");
				continua = leia.next().toUpperCase().charAt(0);
			}while(!(continua == 'S') && !(continua == 'N'));	
				}
			
		mediaIdades = somaIdade / totalPessoas;
		
		//** FALTA TERMINAR TODO CÓDIGO AINDA **//
		
		System.out.printf("Total de pessoas desenvolvedoras Backend: %d\n", backEnd);
		System.out.printf(" %d\n", );
		System.out.printf("O número total de pessoas que responderam à pesquisa: %d\n", totalPessoas);
		System.out.printf("MÉDIA DAS IDADES: %.2f\n", mediaIdades);
		
		leia.close();
	}

}