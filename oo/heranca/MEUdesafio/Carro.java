package oo.heranca.MEUdesafio;

public class Carro {

	int velocidadeAtual; //=atributo

	Carro() { //=contrutor
		this.velocidadeAtual = 0;//garante que o carro comece com velociddade 0
	}

	void acelerar() { //método acelerar
		this.velocidadeAtual += 5; //aumenta a velo em 5 toda vez q chamado
	}

	void frear() { //método frear
		if (this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
		} else { //se a velocidade for menor que 5, ela é definida como 0
			this.velocidadeAtual = 0;
		}
	}

	int getVelocidadeAtual() { //método getVelocidadeAtual
		return velocidadeAtual; //retorna o valor atual da velocidade
		//Isso permite que outras classes consultem 
		//a velocidade sem acessar diretamente a variável.
	}
}
