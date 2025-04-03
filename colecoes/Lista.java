package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista { // LISTA = estrutura ordenada

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana"); // Criei variável e add na lista
		lista.add(u1);
		
		// Criei objeto e add na lista
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); // Acessar pelo indice
		
		System.out.println(">>>> " + lista.remove(1)); // Forma de remover pelo indice
		System.out.println(lista.remove(new Usuario("Manu"))); // Está dizendo se removeu ou não a Manu
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		System.out.println("Tem? " + lista.contains(u1)); 
		
		for(Usuario u: lista) {
			System.out.println(u.nome); // Usando toString = u sozinho ou com u.toString
		}
	}
}
