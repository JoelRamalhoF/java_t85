import java.util.ArrayList;
import java.util.Scanner;

public class Ex02AtividadePratica {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//Criado colections para aluno do tipo string para coleta de caracteres, idade no tipo integer para inteiros e a media no tipo double para casas decimais
		ArrayList<String> aluno = new ArrayList<String>();
		ArrayList<Integer> idade = new ArrayList<Integer>();
		ArrayList<Double> media = new ArrayList<Double>();
		
		char continuar = 'S'; //criado a variavel char que sera utilizada para confirmacao do usuario
		double somaMedias = 0; //criado a variavel de soma das medias
        double mediaGeral = 0; // criado a variavel media geral para somar todas as medias e dividir pela quantidade de alunos inseridos
        
          System.out.println("*************** EXERCÍCIO 02 ATIVIDADE PRATICA  **************");
          System.out.println("***************     CADASTRO DE ALUNOS          **************");
		
		
          
          //do while para cadastrar aluno, idade e confirmar se o usuario deseja continuar ou nao, quando digitado "s" o loop retorna
          do {
              System.out.println("Digite o nome do aluno: ");
              String nome = leia.nextLine();
              aluno.add(nome);

              System.out.println("Digite a idade do aluno: ");
              int idadeAluno = leia.nextInt();
              idade.add(idadeAluno);

              System.out.println("Digite a nota final do aluno: ");
              double notaFinal = leia.nextDouble();
              media.add(notaFinal);

              leia.nextLine();
              
              System.out.println("Deseja cadastrar outro aluno? (S/N)");
              continuar = leia.next().charAt(0);
              
              leia.nextLine(); 

          } while (continuar == 'S' || continuar == 's');

          System.out.println("\n*************** ALUNOS CADASTRADOS ***************");
          
          //Criado a saida, onde faz a leitura de cada dado e exibe na tela

          for (int contador = 0; contador < aluno.size(); contador++) {
              System.out.println("Aluno: " + aluno.get(contador));
              System.out.println("Idade: " + idade.get(contador));
              System.out.println("Nota Final: " + media.get(contador));
              System.out.println("-----------------------------------");

              somaMedias += media.get(contador);
          }
          		// calculo da media geral
          if (media.size() > 0) {
              mediaGeral = somaMedias / media.size();
          }

          System.out.printf("A média geral das notas é: %.2f\n", mediaGeral);

          leia.close();
      }
  }