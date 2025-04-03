package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o dia da semana:"); // não usei println, mas pode ser usado.
		String dia = entrada.next();

		if ("Domingo".equalsIgnoreCase(dia)) //equalsIgnoreCase compara a igualdade das strings
			System.out.println(1);
		else if ("Segunda".equalsIgnoreCase(dia))
			System.out.println(2);
		else if ("Terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia))
			System.out.println(3);
		else if ("Quarta".equalsIgnoreCase(dia))
			System.out.println(4);
		else if ("Quinta".equalsIgnoreCase(dia))
			System.out.println(5);
		else if ("Sexta".equalsIgnoreCase(dia))
			System.out.println(6);
		else if ("Sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia))
			System.out.println(7);
		else {
			System.out.println("Dia invlálido!");
		}

		entrada.close();

	}
}