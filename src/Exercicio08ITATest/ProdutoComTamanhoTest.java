package Exercicio08ITATest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicio08ITA.Produto;
import Exercicio08ITA.ProdutoComTamanho;

class ProdutoComTamanhoTest {
	
	//Como pedido, está comparando apenas pelo atributo código
	@Test
	void equalsTest() {
		ProdutoComTamanho produto1 = new ProdutoComTamanho("2", "Tênis All Star", 159.90, "43");
		ProdutoComTamanho produto2 = new ProdutoComTamanho("2", "Tênis", 179.90, "43");
		
		assertEquals(produto1, produto2);
		assertEquals(true, produto1.equals(produto2));
		
		produto2.setCodigo("3");
		assertNotEquals(produto1, produto2);
		
		produto2.setCodigo("2");
		assertEquals(true, produto1.equals(produto2));
		
		produto2.setTamanho("42");
		assertNotEquals(produto1, produto2);
	}
}
