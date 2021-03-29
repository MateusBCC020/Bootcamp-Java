package Exercicio08ITATest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicio08ITA.Produto;

class ProdutoTest {
	
	//O metodo toString da classe Object foi sobrescrito, por isso esse teste existe
	@Test
	void toStringTest() {
		Produto produto = new Produto ("1", "Camisa", 29.90);
		assertEquals("Camisa", produto.toString());
	}
	
	//Como pedido, está comparando apenas pelo atributo código
	@Test
	void equalsTest() {
		Produto produto1 = new Produto ("2", "Tênis Nike", 259.90);
		Produto produto2 = new Produto ("2", "Tênis Adiddas", 279.90);
		assertEquals(produto1, produto2);
		assertEquals(true, produto1.equals(produto2));
		produto2.setCodigo("3");
		assertNotEquals(produto1, produto2);
	}

}
