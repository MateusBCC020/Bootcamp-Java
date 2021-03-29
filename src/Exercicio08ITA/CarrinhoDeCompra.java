package Exercicio08ITA;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompra {
	
	private Map <Produto, Long> listaCompras = new HashMap<Produto, Long>();
	private double valorTotal = 0;
	
	public void adcionarProduto(Produto produto, Long quantidade) {
		if(this.getListaCompras().containsKey(produto)) {
			listaCompras.put(produto, listaCompras.get(produto) + quantidade);
			return;
		}
		
		this.listaCompras.put(produto, quantidade);
	}
	
	public void removerProduto(Produto produto, Long quantidade) {
		if(this.getListaCompras().containsKey(produto)) {
			if(listaCompras.get(produto) >= quantidade) {
				listaCompras.put(produto, listaCompras.get(produto) - quantidade);
				return;
			}
			listaCompras.put(produto, 0L);
			listaCompras.remove(produto);
		}
	}
	
	public double calcularValorCompra() {
		this.valorTotal = 0;
		this.listaCompras.forEach((k,v) -> {
			valorTotal = valorTotal + (k.getPreco() * listaCompras.get(k));
		});
		return valorTotal;
	}

	public Map<Produto, Long> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(Map<Produto, Long> listaCompras) {
		this.listaCompras = listaCompras;
	}
		
}
