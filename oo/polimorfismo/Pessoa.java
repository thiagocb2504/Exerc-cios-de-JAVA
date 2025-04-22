package oo.polimorfismo;

public class Pessoa {

private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	//polimorfismo está presente quando a classe "Pessoa" tem o método "comer"
	//comer = método
	//arroz, feijão e sorvete = parâmetros
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {			
	    	this.peso = peso;
		}
	}
}
