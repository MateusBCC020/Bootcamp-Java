package POO_04;

import java.util.Random;

public class Estoque {
	private String produto;
	private int quantidade;
	private String nomes[] = {"Arroz", "Feijão", "Farinha", "Óleo", "Leite"};
	
	
	
	public Estoque(String nome, int qtd) {
		setProduto(nome);
		setQuantidade(qtd);
	}
	
	public String sorteiaNome() {
		Random aleatorio = new Random();
		String sorteado = nomes[aleatorio.nextInt(5)];
		return sorteado;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
