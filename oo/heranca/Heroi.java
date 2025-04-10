package oo.heranca;

public class Heroi extends Jogador{ 
//extends é uma palavra reservada que pertence a HERANÇA	
//faz com que o herói receba código através de reuso	
//recebe atibutos e comportamentos por herança	
//pode mudar o comportamento de um método 
	
	public Heroi(int x, int y){
		super(x, y);
	}
    @Override
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
	}
}
