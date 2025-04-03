package Funadamentos;

public class PrimitivoVsObjeto {
	
public static void main(String[] args) {
	
	
	String s = new String("texto");
	s.toUpperCase();
	
	// Wrappers são a versao objeto dos tipos PRIMITIVOS!!!
	int a = 123;
	System.out.println(a);
}
}
