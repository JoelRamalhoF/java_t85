package aula_10_optinonal;

import java.util.Optional;

public class Exemplo02 {

	public static void main(String[] args) {


		String frases[] = new String[5];
		
		frases[2] = "Generation Brasil";
		frases[3] = "Baratinha frita 123";
		
		for(var frase :frases) {
			System.out.println(frase);
		}
		// Optional Vazio
		Optional<String> optionalVazio = Optional.empty();
		System.out.println("Exibir o valor de optionalVazio" + optionalVazio);
		System.out.println("O valor de optionalVazio está vazio?" + optionalVazio.isEmpty());
		
		// Optional com dados
		Optional<String> valorIndice2 = Optional.of(frases[2]);
		System.out.println("\nExibir o valor de valorIndice2 " + valorIndice2);
		System.out.println("\nO valorIndice2 tem alguma coisa? " + valorIndice2.isEmpty());
		System.out.println("\nQual é o valor armazenado em valorIndice2? " + valorIndice2.get());
		
	}

}
