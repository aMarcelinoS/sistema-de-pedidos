package br.com.alexandre.backend.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.alexandre.backend.models.ItemPedido;

public class PedidoDto {
	
	private List<ItemPedido> itens = new ArrayList<>();

	
	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}	
}
