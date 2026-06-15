import java.util.Scanner;

public class Ex2NotaDeAluno {

	public static void main(String[] args) {
		
		// Criado a classe Scanner
	Scanner leia = new Scanner(System.in);
		
	// Criado as variáveis de entrada do nome do aluno e da nota.
	
		String nome;
		float notaFinal; //tipo float para poder armazenar numeros fracionados
		
		//Recebe o nome do Aluno e salva na memoria
		System.out.println("Digite o nome do Aluno: ");
		nome = leia.next();
		
		//Recebe a nota do aluno e salva na memoria
		System.out.println("Digite a Nota Final do "+nome+" :");
		notaFinal = leia.nextFloat();
		
		//condicional Se, indicando que se a nota final for maior ou igual a 7 o aluno esta aprovado
		if (notaFinal >= 7) {
			System.out.println("Aluno: "+nome+" Situação: Aprovado");
			
			//condicional Se nao se, indicando que se a nota final for maior ou igual a 5 e se menor que 7 o aluno esta de recuperacao
		}else if (notaFinal >= 5 && notaFinal < 7) {
			System.out.println("Aluno: "+nome+" Situação: Recuperação");
			
			// condicional senao, se nenhuma das opcoes anteriores forem atendidas
		}else {
			System.out.println("Aluno: "+nome+" Situação: Reprovado");
		}
		
		

	}

}
