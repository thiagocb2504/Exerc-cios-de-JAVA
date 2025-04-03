package Funadamentos.operadores;

public class Atribuição {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b; (+ somar)
		c -= a; // c = c - a; (- subtrair)
		c *= b; // c = c * b; (* multiplicar)
		c /= b; // c = c / a; (/ dividir)
		System.out.println(c);
		c %= b; // c = c % 2; 0 ou 1 (% <-- modulo \ saber se é par ou impar).
		System.out.println(c);
		
		
		
		
 	}
}
