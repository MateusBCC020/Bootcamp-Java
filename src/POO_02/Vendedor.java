package POO_02;

public class Vendedor extends Pessoa{
	private double valorVendas;
	private int porcentagemComissao;
	
	public Vendedor(String nome, String endereco, String telefone, int idade, String cpf,
			int valorVendas, int porcentagemComissao) {
		super(nome, endereco, telefone, idade, cpf);
		this.valorVendas = valorVendas;
		this.porcentagemComissao = porcentagemComissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public int getPorcentagemComissao() {
		return porcentagemComissao;
	}

	public void setPorcentagemComissao(int porcentagemComissao) {
		this.porcentagemComissao = porcentagemComissao;
	}
	
}
