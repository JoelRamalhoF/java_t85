import java.util.ArrayList;
import java.util.Scanner;

public class Ex01ColletionsArray {

	

	public static void main(String[] args) {
		//scanner para ler as entradas
		Scanner leia = new Scanner(System.in);
		
		//ArrayList do tipo string para entrada de palavras
		ArrayList<String> cores = new  ArrayList<String>(); 
	
		
		
		// Pede ao usuário para digitar uma cor, e guarda na memoria em cada índice
		System.out.println("Digite a primeira cor");
		cores.add(leia.next());
		
		System.out.println("Digite a segunda cor");
		cores.add(leia.next());
		
		System.out.println("Digite a terceira cor");
		cores.add(leia.next());
		
		
		System.out.println("Digite a quarta cor");
		cores.add(leia.next());
		
		
		System.out.println("Digite a quinta cor");
		cores.add(leia.next());
		
		
		for (String cor : cores) { // Para cor, retornar valore das cores digitadas
		    System.out.println(cor);
		}
		
		cores.sort(null); // ordena as cores em ordem alfabetica A-Z
		
		for (String ordem : cores) {
			System.out.println(ordem);
		}
		

	}

}
