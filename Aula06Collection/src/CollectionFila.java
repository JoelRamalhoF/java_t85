import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionFila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("x");
		fila.add("y");
		fila.add("z");
		fila.add("a");
		fila.add("b");
		
		// ADICIONA MAIS NOMES/NUMEROS A FILA
		/* System.out.println("Digite o nome do cliente");
		fila.add(leia.next());*/
		fila.remove();
		fila.remove();
		
		System.out.println("Z ainda está na fila? " + fila.contains("z")); ;
		
		for(var cliente : fila) {
			System.out.println(cliente);
		}
		
		

	}

}
