package Exercicio01ITA;

public class principal {
	public static void main(String[] args) {
		Carro carro = new Carro();

		carro.nome = "Ferrari";
		
		carro.acelerar(carro.acelerar(10));
		carro.imprimir();
		
	}	
}
