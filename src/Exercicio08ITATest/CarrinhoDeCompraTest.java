package Exercicio08ITATest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicio08ITA.CarrinhoDeCompra;
import Exercicio08ITA.ProdutoComTamanho;

class CarrinhoDeCompraTest {

	@Test
	void adicionarProdutoTest() {
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		assertTrue(carrinho.getListaCompras().isEmpty());
		ProdutoComTamanho produto = new ProdutoComTamanho("21", "Nintendo Switch", 3199.99, "P");
		carrinho.adcionarProduto(produto, 1L);
		assertFalse(carrinho.getListaCompras().isEmpty());
		carrinho.adcionarProduto(produto, 2L);
		assertEquals(3, carrinho.getListaCompras().get(produto));
	}
	
	@Test
	void removerProdutoTest() {
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		assertTrue(carrinho.getListaCompras().isEmpty());
		ProdutoComTamanho produto = new ProdutoComTamanho("21", "Nintendo Switch", 3199.99, "P");
		carrinho.adcionarProduto(produto, 1L);
		assertFalse(carrinho.getListaCompras().isEmpty());
		carrinho.removerProduto(produto, 1L);
		assertEquals(0, carrinho.getListaCompras().get(produto));
		carrinho.removerProduto(produto, 1L);
		assertEquals(null, carrinho.getListaCompras().get(produto));
	}
	
	@Test
	void calcularValorCompraTest() {
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		ProdutoComTamanho produto = new ProdutoComTamanho("43", "Notebook Gamer", 5799.99, "P");
		carrinho.adcionarProduto(produto, 2L);
		assertEquals(11599.98, carrinho.calcularValorCompra(), 0.02);
	}

}
