package Exercicio09ITATest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicio09ITA.Autoridade;
import Exercicio09ITA.Informal;
import Exercicio09ITA.Respeitoso;

class RespeitosoTest {

	@Test
	void formatarNometest() {
		Autoridade autoridade = new Autoridade("Mônica", "Ribeiro", new Respeitoso("Sra."));
		assertEquals("Sra. Ribeiro", autoridade.getTratamento());
	}
}
