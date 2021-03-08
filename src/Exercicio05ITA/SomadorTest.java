package Exercicio05ITA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomadorTest {

	@Test
	void deveVerificarValoresDasVariaveisAposSoma() {
		Somador somador1 = new Somador();
		Somador somador2 = new Somador();
		somador1.somar();
		somador2.somar();
		assertEquals(1, somador1.valorInstancia);
		assertEquals(1, somador2.valorInstancia);
		assertEquals(2, Somador.valorEstatica);
	}

}
