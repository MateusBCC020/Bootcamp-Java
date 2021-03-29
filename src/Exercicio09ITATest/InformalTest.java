package Exercicio09ITATest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicio09ITA.Autoridade;
import Exercicio09ITA.Informal;

class InformalTest {

	@Test
	void formatarNometest() {
		Autoridade autoridade = new Autoridade("Miguel", "Ribeiro", new Informal());
		assertEquals("Miguel", autoridade.getTratamento());
	}

}
