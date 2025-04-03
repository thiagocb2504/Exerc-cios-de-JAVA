package arrays;

public class Foreach {

	public static void main(String[] args) {

		double[] notas = { 9.9, 8.7, 7.2, 9.4 };//array

		//for tradicional
		for (int i = 0; i < notas.length; i++) {//foreach = forma de percorrer um array de forma 
			//mais fácil
			System.out.println(notas[i]);
		}

		System.out.println();

		for (double nota : notas) {
			System.out.print(nota + " ");
		}

	}
}
