package Exercicio04ITA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RegistroPontosTest {

	@Test
	void pontosCriarTopico() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(5, u.pontos);
	}

}
