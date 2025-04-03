package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		// Usando o < > e String, obrigo a lista a ser tipo string
		// TreeSet garante ordem de inserção
		// SortedSet lista de conjunto que aceita uma ordenação, pode ser ordem ou outra coisa
		//Set<String> listaAprovados = new HashSet<>(); 
		SortedSet<String> listaAprovados = new TreeSet<>(); 
		
		// Valores String
		// Dados homogêneos
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		// Valores inteiros
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		//nums.get(1); NÃO É POSSÍVEL ACESSAR PELO INDICE
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
