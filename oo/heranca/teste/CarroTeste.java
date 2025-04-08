package oo.heranca.teste;

import oo.heranca.desafioResposta.Civic;
import oo.heranca.desafioResposta.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {

		Civic c1 = new Civic(80);

		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		Ferrari c2 = new Ferrari(400);
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);

		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
	}
}
