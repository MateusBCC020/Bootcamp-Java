package Exercicio03ITA;


import java.text.DecimalFormat;

public class Principal {
	public static void main(String... args) {
		Paciente paciente1 = new Paciente(70, 1.84);
		Paciente paciente2 = new Paciente(80, 1.84);
		Paciente paciente3 = new Paciente(90, 1.84);
		
		//Exibe o imc com apenas duas casas decimais
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("IMC Paciente 1: " + df.format(paciente1.calcularIMC()) + ". Diagnóstico: " + paciente1.diagnostico());
		System.out.println("IMC Paciente 2: " + df.format(paciente2.calcularIMC()) + ". Diagnóstico: " + paciente2.diagnostico());
		System.out.println("IMC Paciente 3: " + df.format(paciente3.calcularIMC()) + ". Diagnóstico: " + paciente3.diagnostico());
	}
}
