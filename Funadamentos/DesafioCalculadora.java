package Funadamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - / %
	
	Scanner entrada = new Scanner(System.in); // entrada = defição de como será chamado o objeto do -> Scanner
	
	System.out.println("Valor número 1: "); // transcrever o que está entre parenteses e aspas
	String entrada1 = entrada.nextLine().trim(); // lê a entrada do usuário como uma String, remove espaços extras com trim. 
	double num1 = Double.parseDouble(entrada1); // converte a String lida para um número double
	
	System.out.println("Valor número 2: "); // exibe a mensagem solicitando o segundo número = o mesmo do primeiro syso
	String entrada2 = entrada.nextLine().trim(); // o mesmo da primeira String
	double num2 = Double.parseDouble(entrada2); // mesma coisa do primeiro double 
	
	
	System.out.println("Digite o símbolo da operação que será utilizada?"); // Exibe um menu para o usuário escolher a operação desejada 
	
	System.out.println(" + = Soma:  "); // Exibe um menu para o usuário escolher a operação desejada
	System.out.println(" - = Subtração:  "); // Exibe um menu para o usuário escolher a operação desejada
	System.out.println(" * = Multiplicação:  "); // Exibe um menu para o usuário escolher a operação desejada
	System.out.println(" / = Divisão:  "); // Exibe um menu para o usuário escolher a operação desejada
	
	String operador = entrada.next().trim(); // lê o simbolo digitado pelo usuário e o trim remove espaços em branco 
	System.out.println("O resultado é: ".trim());
	System.out.println("+".equals(operador) ? num1 + num2 : ""); 
	System.out.println("-".equals(operador) ? num1 - num2 : "");
	System.out.println("*".equals(operador) ? num1 * num2 : "");
	System.out.println("/".equals(operador) ? num1 / num2 : "");
	
	entrada.close();
	}

}

