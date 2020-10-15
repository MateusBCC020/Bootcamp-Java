package POO_01;

public class Cliente {
	String nome;
	double saldo;
	String formaDePagamento;
	
	public void getName(String nome) {
		this.nome = nome;
	}
	
	public void getSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean verificaPagamento(double saldo, double preco) {
		if(saldo >= preco)
			return true;
		else
			return false;
	}
	
	public void payWay(int num) {
		if(num == 1)
			formaDePagamento = "Dinheiro";
		else if(num == 2)
			formaDePagamento = "Débito";
		else if(num == 3)
			formaDePagamento = "Crédito";
		else
			System.out.println("Opção inválida!");
	}
}
