package Exercicio08ITA;

public class Principal {
	public static void main(String[] args) {
		
		CarrinhoDeCompra c = new CarrinhoDeCompra();
		c.adcionarProduto(new ProdutoComTamanho("1", "Camisa", 20, "P"), 1L);
		c.adcionarProduto(new ProdutoComTamanho("1", "Camisa", 20, "P"), 1L);
		c.adcionarProduto(new ProdutoComTamanho("3", "Camis", 30, "P"), 1L);
		
		c.getListaCompras().forEach((k,v)->System.out.println(k + " : " + v));
		
		System.out.println(c.calcularValorCompra());
		
		
	}
}
