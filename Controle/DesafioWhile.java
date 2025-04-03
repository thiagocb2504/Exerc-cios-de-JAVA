package Controle;

import java.util.Locale; //Lembrar do ctrl + shift + o
import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		// Quero calcular a médias das notas de uma turma mas não sei quantos alunos tem.
        // Enquanto o usuário não digitar "-1", os valores devem ser armazenados em uma variável
        // e a média deve ser calculada e informada ao usuário
		
		Scanner entrada = new Scanner(System.in); //Lembrar do ctrl + shift + o
		entrada.useLocale(Locale.US); // Garante que o Scanner interprete '.' corretamente

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) { //enquanto a nota for diferente de -1 ele vai executando a  nota
			System.out.print("Informe a nota (ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			if(nota <= 10 && nota >= 0) {
			total += nota; //acrescentando atribuição aditiva à váriavel total 
			quantidadeDeNotas++; //incremento a quantidade de notas
		} else if(nota != -1){
			System.out.println("Nota inválida!!!");
		}
		}
		// Calcular a média
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media); //concatenação 

		entrada.close();
	}
	
}
