package Funadamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final double FATOR = 5 / 9.0;
		final double AJUSTE = 32;
		double F = 86;
		double C = (F - AJUSTE) * FATOR;
		System.out.println("O resultado é " + C + "C");

		F = 150;
		C = (F - AJUSTE) * FATOR;

		System.out.println("O resultado é " + C + "C");

		F = 75;
		C = (F - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + C + "C");
		
		
		F = 69;
		C = (F - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + C + "C");
		
		
		F = -5;
		C = (F - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + C + "C");
		
	}
}
