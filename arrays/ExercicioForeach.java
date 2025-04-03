package arrays;

import java.util.Arrays;

public class ExercicioForeach {
	public static void main(String[] args) {

		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;

		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]); //escolhi a primeira nota
		System.out.println(notasAlunoA[3]);
		
		System.out.println();
		
		for(double nota: notasAlunoA) {
			System.out.print(nota + " ");
		}

		System.out.println();
		
		final double notaArmazenada = 5.9;
	    double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
	    
	    for(double nota: notasAlunoB) {
			System.out.print(nota + " ");
		}
	    
	}
}
