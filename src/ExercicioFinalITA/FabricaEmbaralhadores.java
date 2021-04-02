package ExercicioFinalITA;

import java.util.Random;

public class FabricaEmbaralhadores {
	
	public static Embaralhador criaEmbaralhador() throws Exception {
		Random aleatorio = new Random();
		int sorteio = aleatorio.nextInt(2);
		if(sorteio == 0) {
			return new PrimeiroEmbaralhador();
		}else if(sorteio == 1) {
			return new SegundoEmbaralhador();
		}else {
			Exception ex = new Exception();
			System.out.println("Embaralhador Inexistente! Selecione embaralhadores entre 0 e 1");
			throw ex;
		}
	}
	
}
