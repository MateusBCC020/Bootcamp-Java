package POO_03;

public class Cavalo extends Animal{

	@Override
	public void emitirSom() {
		System.out.println("Relincho");
	}

	@Override
	public void deslocar() {
		System.out.println("Trotando");
	}

}
