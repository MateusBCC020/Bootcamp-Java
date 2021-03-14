package Exercicio01ITA;

public class Carro {
	int potencia;
	int velocidade;
	String nome;
	
	int acelerar() {
		this.velocidade += potencia;
		return this.velocidade;
	}
	
	void frear() {
		velocidade = velocidade / 2;
	}
	
	int getVelocidade() {
		return velocidade;
	}
	
	void imprimir() {
		System.out.println("O carro " +nome+ " Esta a velocidade "+getVelocidade() + "kh/h");
	}
}
