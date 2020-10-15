package POO_01;

import java.util.Random;

public class Enemy {
	public String name;
	public int hp;
	public int atack;
	public String atackType;
	public String atacksTypes[] = {"Water", "Fire", "Earth", "Air", "Normal"};
	public int defense;
	public int accuracy;
	public String enemysNames[] = {"Lobo", "Aranha", "Goblin", "Escorpião"};
	
	
	Random aleatorio = new Random();
	
	public Enemy() {
		this.name = enemysNames[aleatorio.nextInt(4)];
		this.hp = (aleatorio.nextInt(20)+1);
		this.atack = (aleatorio.nextInt(5)+1);
		this.atackType = atacksTypes[aleatorio.nextInt(4)];
		this.defense = aleatorio.nextInt(5) + 1;		
		this.accuracy = aleatorio.nextInt(15) + 1;	
	}
	
	public String getName() {
		return this.name;
	}
	
	public int calculateDodgeChance() {
		int dodgeChance = aleatorio.nextInt(6);
		return dodgeChance;
	}
	
	int atackAtual() {
		int atualAtack = aleatorio.nextInt(this.atack + 10);
		return atualAtack;
	}
	
	public void checkEnemy() {
		System.out.println("Nome: "+this.name);
		System.out.println("Type: " + this.atackType);
		System.out.println("HP: " + this.hp);
		System.out.println("Atack: " + this.atack);
		System.out.println("Defense: " + this.defense);
		System.out.println();
	}
	
}
