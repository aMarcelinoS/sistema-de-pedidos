package br.com.alexandre.backend.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ItemPedido {

	@Column(name = "quantidade")
	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn(name = "id_produto")
	private Produto produto;	
	
	public ItemPedido() {
		
	}
	
	public ItemPedido(Produto produto, Integer quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}


	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
