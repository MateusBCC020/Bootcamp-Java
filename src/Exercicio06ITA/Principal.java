package Exercicio06ITA;

public class Principal {
	public static void main(String[] args) {
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		
		
		pizza1.adicionarIngrediente("Mussarela");
		pizza1.adicionarIngrediente("Calabreza");
		
		pizza2.adicionarIngrediente("Mussarela");
		pizza2.adicionarIngrediente("Catupiri");
		pizza2.adicionarIngrediente("Frango");
		pizza2.adicionarIngrediente("Chedar");
		
		pizza3.adicionarIngrediente("Mussarela");
		pizza3.adicionarIngrediente("Calabreza");
		pizza3.adicionarIngrediente("Bacon");
		pizza3.adicionarIngrediente("Cebola");
		pizza3.adicionarIngrediente("Brocoles");
		pizza3.adicionarIngrediente("Palmito");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarPizza(pizza1);
		carrinho.adicionarPizza(pizza2);
		carrinho.adicionarPizza(pizza3);
		
		System.out.println("O valor total é: " + carrinho.retornaValorTotal());
		System.out.println("A quantidade usada de ingredientes foi: " + Pizza.ingredientesTotal);
		
	}
}
