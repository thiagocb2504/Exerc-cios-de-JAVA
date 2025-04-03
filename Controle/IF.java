package Controle;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a média:");
		double media = entrada.nextDouble();

		if (media <= 10.0 && media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}

		if (media < 7.0 && media >= 4.5) {
			System.out.println("Recuperação!");
			System.out.println("Busque melhorar para não reprovar!");
		}
		if (media < 4.5 && media >= 0) {
			System.out.println("Reprovado!");
			System.out.println("Te vejo ano que vem!");
		}
		entrada.close();
	}

}
