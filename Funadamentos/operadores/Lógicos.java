package Funadamentos.operadores;

public class Lógicos {

	public static void main(String[] args) {
		
		boolean condição1 = true;
		boolean condição2 = 3 > 7;
		
		// pode misturar os operadores no mesmo código: && <--> || <--> ^ <--> !.
		System.out.println(condição1&& !condição2);
		System.out.println(condição1||condição2);
		System.out.println(condição1^condição2);
		System.out.println(!!condição1);
		System.out.println(!condição2);
		
		
		System.out.println("\nTabela verdade do E(and)=&&");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		
		System.out.println("\nTabela verdade OU(OR)=||");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		System.out.println("\nTabela verdade OU Exclusivo(XOR)=^");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
		System.out.println("\nTabela verdade NOT=!");
		System.out.println(!true );
		System.out.println(!false );
	}
}
