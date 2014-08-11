package br.com.megabrew.model;

public class Produto {

	private String nome;
	private String descricao;
	private String unidadeDeMedida;
	private String volume;
	private int quantidade;
	private Double preco;

	public Produto() {
		super();
	}

	public Produto(String nome, String descricao, String unidadeDeMedida,
			String volume, int quantidade, Double preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.unidadeDeMedida = unidadeDeMedida;
		this.volume = volume;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidadeDeMedida() {
		return unidadeDeMedida;
	}

	public void setUnidadeDeMedida(String unidadeDeMedida) {
		this.unidadeDeMedida = unidadeDeMedida;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
