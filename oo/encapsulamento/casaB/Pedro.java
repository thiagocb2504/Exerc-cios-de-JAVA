package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
		 
//      Atributos protecteds são transmitidos por herança
//		Pacote/default não são transmitidos por herança, se não tiver no msm 
//		Os públicos são transmitidos por herança
		
//      Para acessar às heranças NÃO PRECISA CRIAR UMA INSTÂNCIA
		
//		System.out.println(mae.segredo); //privado não transmitido por herança
//		System.out.println(mae.facoDentroDeCasa); //só é visível no msm pacote
		System.out.println(formaDeFalar); 
		System.out.println(todosSabem); 
	}
}


