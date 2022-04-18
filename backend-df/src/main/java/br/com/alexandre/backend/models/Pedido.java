package br.com.alexandre.backend.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import br.com.alexandre.backend.enums.SituacaoPedido;

@Entity
@Table(name = "pedido")
public class Pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private Long id;
	
	@Column(name = "data_hora")
	private LocalDateTime dataHora;
	
	@Column(name = "situacao")
	private String situacao;
	
	private SituacaoPedido situacaoPedido;
	
	@ElementCollection
	@CollectionTable(name = "item_pedido", joinColumns = {@JoinColumn(name = "id_pedido")})
	@OrderBy("produto")
	private List<ItemPedido> itens = new ArrayList<>();

	public Pedido() {
		
	}
	
	public Pedido(Long id, LocalDateTime dataHora, String situacao, SituacaoPedido situacaoPedido ) {
		this.id = id;
		this.dataHora = dataHora;
		this.situacao = situacao;
		this.situacaoPedido = situacaoPedido;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public SituacaoPedido getSituacaoPedido() {
		return situacaoPedido;
	}

	public void setSituacaoPedido(SituacaoPedido situacaoPedido) {
		this.situacaoPedido = situacaoPedido;
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
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}	
}
