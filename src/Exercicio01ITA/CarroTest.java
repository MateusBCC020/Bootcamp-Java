package Exercicio01ITA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroTest {

	@Test
	void Acelerartest() {
		Carro carro = new Carro();
		carro.potencia = 10;
		carro.acelerar();
		assertEquals(10, carro.getVelocidade());
	}

}
