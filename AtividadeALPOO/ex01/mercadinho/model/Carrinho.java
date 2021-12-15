package model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private List<Produto> listaItens = new ArrayList<Produto>();
	private double preco;
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
	
	public List<Produto> getListaItens() {
		return listaItens;
	}
	
	public void adicionarItem(Produto item) {
		listaItens.add(item);		
	}
	
	public String calcularPreco(List<Produto> lista) {
		setPreco(0);
		for (Produto produto : lista) {
			preco += produto.getPreco();
		}
		return "Total Pedido: R$" + getPreco() + " ";
	}
}
