package Controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
		    valor += "#";
	}
		String valor1 = "#";
		for(valor1 = "#"; !valor1.equals("########"); valor1 += "#") {
			System.out.println(valor1);
		}
	}
}
