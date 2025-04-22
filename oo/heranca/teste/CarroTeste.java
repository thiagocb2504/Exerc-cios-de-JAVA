package oo.heranca.teste;

import oo.heranca.desafioResposta.Carro;
import oo.heranca.desafioResposta.Civic;
import oo.heranca.desafioResposta.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Civic(80);

		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		Ferrari c2 = new Ferrari(400);
		c2.ligarTurbo();
		c2.ligarArcondicionado();
		c2.desligarArcondicionado();
		
		System.out.println(c2.velocidadeDoAr());
		
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
