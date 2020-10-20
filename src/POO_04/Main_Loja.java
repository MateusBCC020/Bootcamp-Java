package POO_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Main_Loja {
	public static void main(String[] args) {
		Collection<Estoque> estoque = new ArrayList<Estoque>();
		Estoque vetorProdutos[] = new Estoque[5];
		Estoque p = new Estoque("a", 1);
		Random aleatorio = new Random();
		int i = 0;
		
		for(Estoque cont: vetorProdutos) {
			vetorProdutos[i] = new Estoque(p.sorteiaNome(), aleatorio.nextInt(201));
			estoque.add(vetorProdutos[i]);
			i++;
		}
		
		
		int escolha;

		do {
			System.out.println("Escolha o que deseja fazer");
			System.out.println("(1) Ver produtos em estoque");
			System.out.println("(2) Adicionar produtos em estoque");
			System.out.println("(3) Remover produto do estoque");
			System.out.println("(4) Sair do Programa");
			Scanner ler = new Scanner(System.in);
			escolha = ler.nextInt();
			if(escolha == 1) {
				System.out.println();
				estoque.forEach((Estoque value) -> System.out.print(value.getProduto()+"\n"));
				System.out.println();
			}else if(escolha == 2) {
				System.out.printf("Nome do produto: ");
				String nomeProd = ler.next();
				System.out.printf("Quantidade do Produto: ");
				int qtd = ler.nextInt();
				Estoque x = new Estoque(nomeProd, qtd);
				estoque.add(x);
			}else if(escolha == 3) {
				System.out.printf("Que item deseja remover: ");
				String nomeProd = ler.next();
				Estoque x = new Estoque(nomeProd, 0);
				for(Estoque cont: vetorProdutos) {
					if(cont.getProduto().equals(x.getProduto())) {
						estoque.remove(cont);
					}
				}
			}else if(escolha == 4) {
				System.out.println("Fim do programa");
			}else {
				System.out.println("Opção inválida! Escolha novamente");
			}
			
			
		} while (escolha != 4);
		
		
				
	}
}
