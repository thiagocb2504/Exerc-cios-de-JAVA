package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" }) // CTRL 1 
	public static void main(String[] args) {
        // dados HETEROGÊNEOS
		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double para Double
		conjunto.add(true); // boolean para Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int para Integer
		conjunto.add('x'); // char para Caracter

		System.out.println("Tamanho é " + conjunto.size());

		conjunto.add("Teste"); // Qual será o tamanho do nosso conjunto dps de add teste
		conjunto.add('x');
		System.out.println("Tamanho é " + conjunto.size());

		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho é " + conjunto.size());

		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // União entre dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
