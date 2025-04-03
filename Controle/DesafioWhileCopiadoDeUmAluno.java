package Controle;

import java.util.Scanner;

public class DesafioWhileCopiadoDeUmAluno {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double contador = 0;
		double nota = 0;
		double a = nota;
		
		System.out.println("Informe às suas notas:/n");
		while (nota != -1) {
			nota = entrada.nextDouble();
			if(nota <= 10 && nota >0) {
				double total =a += nota;
				++contador;
				System.out.println("Caso queira parar de adicionar notas digite '-1'/n");
				double media = total / contador;
				System.out.println("Você inseriu " + contador+ " números válidos e a média entre eles é: " + media);
			}
		
		}

		entrada.close();
	}
}
