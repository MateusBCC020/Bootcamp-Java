package Exercicio02ITA;

public class principal {
	public static void main(String[] args) {
		Compra compra1 = new Compra(2000);
		Compra compra2 = new Compra(4, 500);
		System.out.println("O valor total da compra 2 foi: "+ compra2.getValorTotal());
	}
}
