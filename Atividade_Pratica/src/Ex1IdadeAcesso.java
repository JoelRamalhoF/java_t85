import java.util.Scanner;

public class Ex1IdadeAcesso {

	public static void main(String[] args) {
		
		// Criado a classe Scanner
	Scanner leia = new Scanner(System.in);
		
	// Criado as variáveis de entrada do nome da pessoa, idade e se possui autorizacao.
	
		String nome;
		int idade; // idade do tipo inteiro
		boolean autorizacao; // autorizacao de entrada sendo true para sim e false para nao.
		
		//Recebe o nome da pessoa e salva na memoria
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		
		// Recebe a idade da pessoa e salva na memoria
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		//Pergunta se a pessoa possui autorizacao
		
		System.out.println("*** Possui Autorização? ***");
		autorizacao = leia.nextBoolean();
		
		//Se a pessoa tem idade maior ou igual a 18 anos, o acesso esta liberado mesmo sem autorizacao
		
		if (idade >= 18) {
			System.out.println("*** Acesso Liberado com Autorização Para "+nome+ "***");
		}
		// Se a pessoa tiver menos de 18 anos mas tem autorizacao, o acesso é liberado
		
			else if (idade < 18 && autorizacao) {
				System.out.println("*** Acesso Liberado com Autorização Para "+nome+ "***");
				autorizacao = leia.nextBoolean();
			
				//Se a pessoa não atender a nenhum dos requisitos, o valor retorna como acesso negado
		}else{
			System.out.println("*** Acesso Negado Para "+nome+ "***");
			
			
		}
		
		
		
		leia.close();
	
		}
		}
		
