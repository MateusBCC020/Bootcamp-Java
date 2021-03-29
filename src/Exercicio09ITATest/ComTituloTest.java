package Exercicio09ITATest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicio09ITA.Autoridade;
import Exercicio09ITA.ComTitulo;
import Exercicio09ITA.Informal;
import Exercicio09ITA.Respeitoso;

class ComTituloTest {

	@Test
	void getTratamentoTest() {
		Autoridade autoridade3 = new Autoridade("Rosemeire", "Santos", new ComTitulo("Ilustríssima"));
		assertEquals("Ilustríssima Rosemeire Santos", autoridade3.getTratamento());
	}
}
