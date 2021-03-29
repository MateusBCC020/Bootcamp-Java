package Exercicio08ITA;

public class ProdutoComTamanho extends Produto{
	
	private String tamanho;

	public ProdutoComTamanho(String codigo, String nome, double preco, String tamanho) {
		super(codigo, nome, preco);
		this.tamanho = tamanho;
	}
	
	@Override
	public int hashCode() {
		final int prime = 19;
		int result = 1;
		result = prime * result + ((super.getCodigo() == null) ? 0 : super.getCodigo().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if(this.tamanho != other.tamanho) return false;
		if (super.getCodigo() == null) {
			if (other.getCodigo() != null)
				return false;
		} 
		
		return super.getCodigo().equals(other.getCodigo());
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
}
