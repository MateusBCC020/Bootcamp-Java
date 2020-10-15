package POO_01;

public class Aviao {
	int capacidade;
	double velocidade;
	boolean voando;
	
	void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	void getCapacidade() {
		System.out.println("A capacidade é: " + this.capacidade);
	}
	
	void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	void getVelocidade() {
		System.out.println("A velocidade é: " + this.velocidade);
	}
	
	void setVoo(boolean voando) {
		this.voando = voando;
	}
	
	boolean verificaVoo() {
		if(voando == true)
			return true;
		else
			return false;
	}
	
}
