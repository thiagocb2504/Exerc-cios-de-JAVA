package Controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = ""; // criei variavel=string chamada valor
		
		while(!valor.equalsIgnoreCase("sair")){ //simbolo de exclamação significa negação, usei para não repetir
			//enquanto não for digitado a palavra "sair" continue repetindo quantas vezes quiser.
			System.out.println("Você diz: ");
			valor = entrada.nextLine(); //atribuir a variavel "valor" a entrada.nextline
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}
}
