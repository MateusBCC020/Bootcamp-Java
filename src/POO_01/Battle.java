package POO_01;

import java.util.Scanner;

public class Battle {
	int turns;
	boolean endBattle;
	boolean victory;
	int escolha;
	Enemy inimigo = new Enemy();
	MainCharacter personagem = new MainCharacter();
	
	
	public Battle() {
		this.turns = 0;
		this.endBattle = false;
	}
	
	void startBattle() {
		System.out.println(inimigo.name+" apareceu!");
		while(inimigo.hp > 0 && this.endBattle == false) {
			round();
		}
		if(victory == true) {
			System.out.println("Você venceu!");
		}
	}
	
	void choose() {
		System.out.println("Ações");
		System.out.println("(1) Atacar");
		System.out.println("(2) Checar");
		System.out.println("(3) Fugir");
		System.out.printf("Escolha uma ação: ");
		Scanner ler = new Scanner(System.in);
		this.escolha = ler.nextInt();
		System.out.println();
	}
	
	void round() {
		choose();
		
		if(this.escolha == 1) {
			if(inimigo.calculateDodgeChance() > personagem.accuracy)
				System.out.println("Você errou!");
			else {
				int valorAtaqueAtual = personagem.atackAtual();
				if(valorAtaqueAtual < inimigo.defense)
					System.out.println("Dano 0");
				else {
					inimigo.hp = inimigo.hp - (valorAtaqueAtual - inimigo.defense);
					System.out.println("O dano do seu ataque foi: " + (valorAtaqueAtual - inimigo.defense));
				}
			}
			if(inimigo.hp <= 0)
				this.victory = true;
			this.turns++;
		}
		else if(this.escolha == 2) {
			inimigo.checkEnemy();
			this.turns++;
		}
		else if(this.escolha == 3) {
			this.endBattle = true;
			System.out.println("Você escapou");
		}
	}
}
