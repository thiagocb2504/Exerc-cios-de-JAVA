package Controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		//WHILE --> da habilidade de conter repetição no código
		//Seja para repetir uma sentença de código ou um bloco inteiro
		//WHILE = Enquanto uma determinada expressão for verdadeira ele vai ficar executando 
		//aquele bloco/sentença multiplas vezes até que uma determinada condição vire FALSA.
		
		int contador = 1;
		
		while(contador <= 20) {
		    System.out.printf("i = %d\n", contador);
		    contador+= 2; //colocar no contador o simbolo "++" para ele não ultrapassar o valor determinado em while
		    //já colocando += e um valor ao lado, ele acrescenta a cada linha o valor inserido no +=
		}
		
		
	}
}
