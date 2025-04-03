package oo.encapsulamento.casaA;

public class Paulo {

	
	void testeAcessos() {
		Ana esposa = new Ana();
		
//		System.out.println(esposa.segredo); //privado
		System.out.println(esposa.facoDentroDeCasa); //default ou pacote
		System.out.println(esposa.formaDeFalar); //protegido e transmitido por herança
		System.out.println(esposa.todosSabem); //publico
	}
}
