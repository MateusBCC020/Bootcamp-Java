package Exercicio03ITA;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;

class PacienteTest {
	
	@Test
	public void deveVerificarCalculoIMC() {
		Paciente paciente = new Paciente(70.6, 1.84);
		assertEquals(20.9, paciente.calcularIMC(), 0.05);
	}

	@Test
	public void deveVerificarBaixoPesoMuitoGrave() {
		Paciente paciente = new Paciente(50.3, 1.80);
		assertEquals("Baixo peso muito grave = IMC abaixo de 16 kg/m²", paciente.diagnostico());
	}
	
	@Test
	public void deveVerificarBaixoPesoGrave() {
		Paciente paciente = new Paciente(53.7, 1.80);
		assertEquals("Baixo peso grave = IMC entre 16 e 16,99 kg/m²", paciente.diagnostico());
	}
	
	@Test
	public void deveVerificarBaixoPeso() {
		Paciente paciente = new Paciente(57.6, 1.80);
		assertEquals("Baixo peso = IMC entre 17 e 18,49 kg/m²", paciente.diagnostico());
	}
	
	@Test
	public void deveVerificarPesoNormal() {
		Paciente paciente = new Paciente(65, 1.80);
		assertEquals("Peso normal = IMC entre 18,50 e 24,99 kg/m²", paciente.diagnostico());
	}
	
	@Test
	public void deveVerificarSobrepeso() {
		Paciente paciente = new Paciente(85.2, 1.80);
		assertEquals("Sobrepeso = IMC entre 25 e 29,99 kg/m²", paciente.diagnostico());
	}
	
	@Test
	public void deveVerificarObresidadeI() {
		Paciente paciente = new Paciente(99.1, 1.80);
		assertEquals("Obesidade grau I = IMC entre 30 e 39,99 kg/m²", paciente.diagnostico());
	}
	
	@Test
	public void deveVerificarObresidadeII() {
		Paciente paciente = new Paciente(120.8, 1.80);
		assertEquals("Obesidade grau II = IMC entre 35 e 39,99 kg/m²", paciente.diagnostico());
	}
	
	@Test
	public void deveVerificarObresidadeIII() {
		Paciente paciente = new Paciente(142.5, 1.80);
		assertEquals("Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²", paciente.diagnostico());
	}


}
