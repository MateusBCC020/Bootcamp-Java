package POO_03;

public class Cachorro extends Animal{

	@Override
	public void emitirSom() {
		System.out.println("Au! Au!");
	}

	@Override
	public void deslocar() {
		System.out.println("Correndo");
	}
	
}
