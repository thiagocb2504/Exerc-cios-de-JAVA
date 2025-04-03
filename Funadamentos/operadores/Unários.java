package Funadamentos.operadores;

public class Unários {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; //incrementar // a = a + 1;
		a--; //decrementar // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desaio...");
		System.out.println(++a == b--); //colocar o incremento antes signfica mais pressa e depois menos pressa
		System.out.println(a == b); 
		System.out.println(a);
		System.out.println(b);
	}
}
