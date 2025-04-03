package Funadamentos.conversão;

public class ConversãoTiposPrimitivosNumericos {

	public static void main(String[] args) {

		double a = 1; // IMPLÍCITA
		System.out.println(a);
		// Melhor não utilizar muito byte em programa, optar por INT e Double
		float b = (float) 1.123456788888; // EXPLÍCITA (cast)
		System.out.println(b);

		int c = 340;
		byte d = (byte) c; // EXPLÍCITA (cast)
		System.out.println(d);

		double e = 1.9999999;
		int f = (int) e; // EXPLÍCITA (cast)
		System.out.println(f);

	}

}
