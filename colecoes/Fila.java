package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
	
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); // Use add() quando você deseja garantir que a 
		//adição será bem-sucedida e está disposto a lidar com uma exceção caso a coleção esteja cheia.
		fila.offer("Bia"); // Use offer() quando deseja evitar exceções e 
		//apenas verificar se a adição foi possível.
		fila.add("Carlos");
		fila.offer("Daniel"); // .offer() retorna falso caso a fila esteja cheia.
		fila.add("Rafaela"); // .add() lançará uma exceção caso a fila esteja cheia.
		fila.offer("Gui");
		
		// Peek e Element -> obter o proximo elemento da fila sem remover
		// Diferença do comportamento 
		// ocorre quando a fila está vazia
		System.out.println(fila.peek()); // Retorna falso
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exceção
		System.out.println(fila.element());
		
		// Poll e Remove -> obter o proximo elemento
		// da fila e remove
		
		// Diferença do comportamento 
		// ocorre quando a fila está vazia
		System.out.println(fila.poll()); // Retorna falso
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // Lança uma exceção
		
		// Outros metodos
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains();

	}
}
