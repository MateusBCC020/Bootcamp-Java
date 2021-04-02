package ExercicioFinalITA;

public class Principal {
	public static void main(String[] args) throws Exception {
		String personagem = BancoDePalavras.retornaPersonagem();
		Embaralhador embaralhador = FabricaEmbaralhadores.criaEmbaralhador();
		System.out.println(embaralhador.embraralhar(personagem));
	}
}
