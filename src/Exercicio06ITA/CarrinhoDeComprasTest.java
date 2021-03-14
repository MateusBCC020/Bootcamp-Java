package Exercicio06ITA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CarrinhoDeComprasTest {
	
	@Before
	private void zeraIngredientes() {
		Pizza.zerarTotalIngredientes();
	}

	@Test
	public void deveVerificarAdicaoDePizza() {
		Pizza pizza = new Pizza();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarPizza(pizza);
		assertEquals(true, carrinho.getPizzasNoCarrinho().isEmpty());
		pizza.adicionarIngrediente("Chocolate");
		carrinho.adicionarPizza(pizza);
		assertNotEquals(true, carrinho.getPizzasNoCarrinho().isEmpty());
	}
	
	@Test
	public void deveVerificarValorFinal() {
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		pizza1.adicionarIngrediente("Brocolis");
		pizza1.adicionarIngrediente("Atum");
		carrinho.adicionarPizza(pizza1);
		pizza2.adicionarIngrediente("Banana");
		pizza2.adicionarIngrediente("Chocolate");
		pizza2.adicionarIngrediente("Canela");
		carrinho.adicionarPizza(pizza2);
		assertEquals(35, carrinho.retornaValorTotal());		
	}

}
