package Exercicio09ITATest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicio09ITA.Autoridade;
import Exercicio09ITA.ComTitulo;
import Exercicio09ITA.Informal;
import Exercicio09ITA.Respeitoso;

class AutoridadeTest {

	@Test
	void getTratamentoTest() {
		Autoridade autoridade1 = new Autoridade("Mateus", "Ribeiro", new Informal());
		Autoridade autoridade2 = new Autoridade("Mateus", "Ribeiro", new Respeitoso("Sr."));
		Autoridade autoridade3 = new Autoridade("Mateus", "Ribeiro", new ComTitulo("Ilustríssimo"));
		assertEquals("Mateus", autoridade1.getTratamento());
		assertEquals("Sr. Ribeiro", autoridade2.getTratamento());
		assertEquals("Ilustríssimo Mateus Ribeiro", autoridade3.getTratamento());
	}

}
