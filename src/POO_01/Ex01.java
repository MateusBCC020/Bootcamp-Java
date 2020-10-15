package POO_01;

public class Ex01 {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.getName("Mateus");
		cliente1.getSaldo(25.52);
		cliente1.payWay(2);
		
		System.out.println(cliente1.nome);
		System.out.println(cliente1.formaDePagamento);
		System.out.println(cliente1.saldo);
	}
}
