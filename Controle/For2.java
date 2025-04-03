package Controle;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		for(int contador = 10; contador >= 0; contador-=2) { //inverti o 0 que tava no 1° contador
			//passei o 10 para o 1° contador e 0 para o 2° e usei o simbolo de "maior = >"
			//também tirei o ++ que estava dps do contador e coloquei -- ou -= e numero no fim.
			System.out.printf("contador = %d\n", contador);
		}

		entrada.close();
	}
}
