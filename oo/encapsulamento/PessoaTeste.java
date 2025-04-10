package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", " Amoedo", -45);
		p1.setIdade (230); // alteramos o valor da variavel
		
		System.out.println(p1.getIdade()); // lemos o valor da variavel
		System.out.println(p1); // lemos o valor da variavel
		System.out.println(p1.getNomeCompleto());
	}
}
