package Classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
	}

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormatada() { // forma mais interessante em utilizar
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	}

	void imprimirDataFormatada() { // só funciona no terminal, não funciona na web, mobile e etc
		System.out.println(this.obterDataFormatada());

	}
}
