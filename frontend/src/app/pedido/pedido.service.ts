import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Produto } from '../produto';
import { Pedido, ItemPedido } from '../pedido';

@Injectable({
  providedIn: 'root'
})
export class PedidoService {

  itens: ItemPedido[] = [];

  constructor(private httpClient: HttpClient) {}

  adicionaProduto(produto: Produto) {
    let item = this.itens.find(item => item.produto.descricao === produto.descricao);
    if (item) {
      item.quantidade++;
    } else {
      this.itens.push({ produto, quantidade: 1 });
    }
  }

  limpaPedido() {
    this.itens = [];
  }

  realizaPedido() {
    this.httpClient.post<Pedido>("http://localhost:8080/pedidos", {
      itens: this.itens
    }).subscribe(pedido => {
      console.log(pedido)});
  }

  get valorTotal() {
    let valor = 0;
    for (const item of this.itens) {
      valor += item.produto.preco * item.quantidade;
    }
    return valor;
  }

  get quantidadeTotal() {
    let quantidade = 0;
    for (const item of this.itens) {
      quantidade += item.quantidade;
    }
    return quantidade;
  }
}
