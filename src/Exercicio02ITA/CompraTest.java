package Exercicio02ITA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompraTest {

	@Test
	void CompraAVista() {
		Compra compra = new Compra(500);
		assertEquals(1, compra.getNumeroParcelas());
		assertEquals(500, compra.getValorParcelas());
	}
	
	@Test
	void CompraParcelada() {
		Compra compra = new Compra(2 ,250);
		assertEquals(2, compra.getNumeroParcelas());
		assertEquals(500, compra.getValorTotal());
	}

}
