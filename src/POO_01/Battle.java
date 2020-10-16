package POO_01;

import java.util.Scanner;

public class Battle {
	int turns;
	boolean endBattle;
	boolean victory;
	boolean lose;
	int escolha;
	Enemy inimigo = new Enemy();
	MainCharacter personagem = new MainCharacter();
	
	void battleStatus() {
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("SEU STATUS\t|\tSTATUS DO INIMIGO");
		System.out.println("----------\t\t-----------------");
		System.out.println(personagem.name+"\t\t\t"+inimigo.name);
		System.out.println("HP: "+ personagem.hp+"\t\t\tHP: "+inimigo.hp);
		System.out.println();
	}
	
	
	public Battle() {
		this.turns = 0;
		this.endBattle = false;
	}
	
	void startBattle() {
		System.out.println(inimigo.name+" apareceu!");
		while(inimigo.hp > 0 && this.endBattle == false && this.lose == false) {
			battleStatus();
			round();
		}
		if(this.victory == true) {
			System.out.println("Você venceu!");
		}
		else if(this.lose == true)
			System.out.println("Você foi derrotado(a)!");
	}
	
	void choose() {
		System.out.println("Ações");
		System.out.println("(1) Atacar");
		System.out.println("(2) Checar Inimigo");
		System.out.println("(3) Status do seu personagem");
		System.out.println("(4) Fugir");
		System.out.printf("Escolha uma ação: ");
		Scanner ler = new Scanner(System.in);
		this.escolha = ler.nextInt();
		System.out.println();
	}
	
	void EnemyAtackround() {
		System.out.println("Inimigo te ataca!");
		if(personagem.calculateDodgeChance() > inimigo.accuracy)
				System.out.println("Mas você desviou!\n");
		else {
			int valorAtaqueAtual = inimigo.atackAtual();
			if(valorAtaqueAtual < personagem.defense)
				System.out.println("Mas você não receu dano\n");
			else {
				personagem.hp = personagem.hp - (valorAtaqueAtual - personagem.defense);
				System.out.println("O dano recebido foi: " + (valorAtaqueAtual - personagem.defense));
				System.out.println();
				if(personagem.hp <= 0) {
					this.lose = true;
				}
				this.turns++;
			}
		}
	}
	
	void mainCharacterRound() {
		if(this.escolha == 1) {
			if(inimigo.calculateDodgeChance() > personagem.accuracy)
				System.out.println("Você errou!\n");
			else {
				int valorAtaqueAtual = personagem.atackAtual();
				if(valorAtaqueAtual < inimigo.defense)
					System.out.println("Seu ataque não causou dano\n");
				else {
					inimigo.hp = inimigo.hp - (valorAtaqueAtual - inimigo.defense);
					System.out.println("O dano do seu ataque foi: " + (valorAtaqueAtual - inimigo.defense));
					System.out.println();
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
			personagem.checkCharacter();
		}
		else if(this.escolha == 4) {
			this.endBattle = true;
			System.out.println("Você escapou");
		}
	}
	
	
	void round() {
		choose();
		mainCharacterRound();
		EnemyAtackround();
	}
}
