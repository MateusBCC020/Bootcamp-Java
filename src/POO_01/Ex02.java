package POO_01;

public class Ex02 {
	public static void main(String[] args) {
		Aviao boing = new Aviao();
		boing.setCapacidade(120);
		boing.getCapacidade();
		
		boing.setVelocidade(220.8);
		boing.getVelocidade();
		
		boing.setVoo(true);
		if(boing.verificaVoo() == false)
			System.out.println("Você ainda não decolou");
		else
			System.out.println("Você já decolou");
	}
}
