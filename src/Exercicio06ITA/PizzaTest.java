package Exercicio06ITA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class PizzaTest {
	
	@BeforeClass
	public void deveZerarIngredientes() {
		Pizza.zerarTotalIngredientes();
	}

	@Test
	public void deveVerificarAdicaoIngrediente() {
		int qtdIngredientesInicial = Pizza.ingredientesTotal;
		Pizza pizza = new Pizza();
		pizza.adicionarIngrediente("Tomate");
		assertNotEquals(qtdIngredientesInicial, Pizza.ingredientesTotal);
		assertEquals(pizza.getListaIngredientes().get(0), "Tomate");
	}
	
	public void deveVerificarValorPizza() {
		Pizza pizza = new Pizza();
		pizza.adicionarIngrediente("Calabreza");
		assertEquals(15, pizza.getPreco());
	}

}
