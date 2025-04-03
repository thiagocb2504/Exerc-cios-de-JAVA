package Funadamentos.operadores;

public class DesafioLógicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		// Se um trabalho da certo vou comprar a TV de 32 polegadas
		// Se os dois derem certo será a de 50 
		// Nos dois casos comprando ou de 50 ou de 32 a familia vai tomar sorvete
		// Se nenhum da certo, familia vai ficar em casa fica com fome em casa 
		
		System.out.println("Os dois trabalhos deram certo");
		boolean TrabalhoTerça = true;
		boolean TrabalhoQuinta =true;
		
		System.out.println("Comprar uma TV de 50':");
		System.out.println(TrabalhoTerça&&TrabalhoQuinta);
		System.out.println("Comprar uma TV de 32':");
		System.out.println(TrabalhoTerça^TrabalhoQuinta);
		System.out.println("Ir tomar sorvete com a familia:");
		System.out.println(TrabalhoTerça||TrabalhoQuinta);
		
		System.out.println("\n");
		
		System.out.println("Só deu certo um trabalho:");
		TrabalhoTerça = true;
		TrabalhoQuinta = false;
		
		System.out.println("Comprar uma TV de 50':");
		System.out.println(TrabalhoTerça&&TrabalhoQuinta);
		System.out.println("Comprar uma TV de 32':");
		System.out.println(TrabalhoTerça^TrabalhoQuinta);
		System.out.println("Ir tomar sorvete com a familia:");
		System.out.println(TrabalhoTerça||TrabalhoQuinta);
		
		System.out.println("\n");
		
		System.out.println("Nenhum dos trabalhos deram certo:");
		TrabalhoTerça = false;
		TrabalhoQuinta = false;
		
		System.out.println("Comprar uma TV de 50':");
		System.out.println(TrabalhoTerça&&TrabalhoQuinta);
		System.out.println("Comprar uma TV de 32':");
		System.out.println(TrabalhoTerça^TrabalhoQuinta);
		System.out.println("Ir tomar sorvete com a familia:");
		System.out.println(TrabalhoTerça||TrabalhoQuinta);
	}
	
}
