package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	
	private final List<Produto> catalogo = new ArrayList<>();
	
	private String nome;
	private double preco;
	private int codigo;
	
	public Produto() {
	}

	public Produto(int codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
	
	public List<Produto> getCatalogo() {
		return catalogo;
	}
	
	public void cadastrarNovoProduto(String nome, double preco) {
		int codigo;
		if(getCatalogo().size() > 0) {
			codigo = getCatalogo().get(getCatalogo().size()-1).getCodigo() + 1;			
		}
		else {
			codigo = 1;
		}
		catalogo.add(new Produto(codigo,nome,preco));
	}
	
	public void inicializaProdutosMock() {
		cadastrarNovoProduto("Coca-Cola 2L", 10.0 );
		cadastrarNovoProduto("Doritos", 7.5 );
		cadastrarNovoProduto("Oreo", 2.8 );
		cadastrarNovoProduto("Pringles", 13.7 );
		cadastrarNovoProduto("Amstel 269ml", 2.19 );
	}
	
	@Override
	public String toString() {
		return getNome() + " - R$" + getPreco();
	}
}
