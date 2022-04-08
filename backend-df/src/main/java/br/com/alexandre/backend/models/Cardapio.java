package br.com.alexandre.backend.models;

import java.io.Serializable;
import java.util.Objects;

public class Cardapio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String tipo;
	private String nome;
	private Double preco;
	
	public Cardapio() {
	}

	public Cardapio(Long id, String tipo, String nome, Double preco) {
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cardapio other = (Cardapio) obj;
		return Objects.equals(id, other.id);
	}
}
