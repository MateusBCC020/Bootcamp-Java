package Exercicio06ITA;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	List<Pizza> pizzasNoCarrinho = new ArrayList<>();
	
	public void adicionarPizza(Pizza pizza) {
		if(pizza.listaIngredientes.size() <= 0) return;
		pizzasNoCarrinho.add(pizza);
	}

	public double retornaValorTotal() {
		double valorTotal = 0;
		for(Pizza elemento : pizzasNoCarrinho) {
			valorTotal += elemento.getPreco();
		}
		return valorTotal;
	}
	
	public List<Pizza> getPizzasNoCarrinho() {
		return pizzasNoCarrinho;
	}

	public void setPizzasNoCarrinho(List<Pizza> pizzasNoCarrinho) {
		this.pizzasNoCarrinho = pizzasNoCarrinho;
	}
}
