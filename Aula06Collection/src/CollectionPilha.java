import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionPilha {

	public static void main(String[] args) {
		
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.push("azul");
		pilha.push("verde");
		pilha.push("amarelo");
		pilha.push("branco");
		pilha.push("laranja");
		
		pilha.pop();
		
		
		System.out.println("A cor azul ainda esta na pilha?" + pilha.contains("azul"));
		
		for (var cor : pilha) {
			System.out.println(cor);
		}

	}

}
