package oo.abstrato;

public abstract class Mamífero extends Animal{

	public abstract String mamar();
	
	@Override
	public String mover() {
		return "Saindo do lugar";
	}
}
