package Exercicio09ITA;

public class Respeitoso implements FormatadorNome{
	
	private String tratamento;
	
	public Respeitoso(String tratamento) {
		this.tratamento = tratamento;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		
		return this.tratamento + " " + sobrenome;
	}

}
