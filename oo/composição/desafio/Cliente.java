package oo.composição.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
//Um cliente tem muitas compras, uma compra tem um cliente
	
	final String nome;
	//Relação unidirecional
	List<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}
}
