package POO_02;

public class Administrador extends Pessoa {
	
	private double ajudaDeCusto;
	private int codigoFuncionario;
	
	public Administrador(String nome, String endereco, String telefone, int idade,
			String cpf, double ajudaDeCusto, int codigoFuncionario) {
		super(nome, endereco, telefone, idade, cpf);
		this.ajudaDeCusto = ajudaDeCusto;
		this.codigoFuncionario = codigoFuncionario;		
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}
	
	
	
}
