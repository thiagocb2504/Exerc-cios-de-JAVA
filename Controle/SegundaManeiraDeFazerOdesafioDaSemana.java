package Controle;

import java.util.Scanner;

public class SegundaManeiraDeFazerOdesafioDaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia da semana:");
        String dia = entrada.nextLine().toLowerCase();
        
        if (dia.equals("domingo")) {
            System.out.println("1");
        } else if (dia.equals("segunda")) {
            System.out.println("2");
        } else if (dia.equals("terça") || dia.equals("terca")) {
            System.out.println("3");
        } else if (dia.equals("quarta")) {
            System.out.println("4");
        } else if (dia.equals("quinta")) {
            System.out.println("5");
        } else if (dia.equals("sexta")) {
            System.out.println("6");
        } else if (dia.equals("sábado") || dia.equals("sabado")) {
        } System.out.println("7");
        
        entrada.close();
        }
}
