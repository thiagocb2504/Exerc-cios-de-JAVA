package oo.heranca.MEUdesafio;

public class CarroTeste {

	public static void main(String[] args) {
        Carro omega = new Omega();
        Carro opala71 = new Opala();

        System.out.println("Omega acelera:");
        omega.acelerar();
        omega.acelerar();
        omega.acelerar();
        System.out.println("Velocidade atual do Omega: " + omega.getVelocidadeAtual());

        System.out.println("\nOmega freia:");
        omega.frear();
        omega.frear();
        omega.frear();
        omega.frear();
        System.out.println("Velocidade atual do Omega: " + omega.getVelocidadeAtual());
        
        System.out.println("\nOpala acelera:");
        opala71.acelerar();
        opala71.acelerar();
        opala71.acelerar();
        opala71.acelerar();
        opala71.acelerar();
        opala71.acelerar();
        System.out.println("Velocidade atual do Opala: " + opala71.getVelocidadeAtual());

        System.out.println("\nOpala freia:");
        opala71.frear();
        System.out.println("Velocidade atual do Opala: " + opala71.getVelocidadeAtual());
    }
}
