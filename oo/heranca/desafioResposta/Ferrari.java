package oo.heranca.desafioResposta;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarArcondicionado;

	public Ferrari() {
		this(315);
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15); // normal 15
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarArcondicionado() {
		ligarArcondicionado = true;
	}

	@Override
	public void desligarArcondicionado() {
		ligarArcondicionado = false;
	}

	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarArcondicionado) {
			return 35;
		} else if (ligarTurbo && ligarArcondicionado) {
			return 30;
		} else if (!ligarTurbo && !ligarArcondicionado) {
			return 20;
		} else {
			return 15;
		}
	}
}
//	@Override
//	public void acelerar() {
//		super.acelerar(); 
//	}
