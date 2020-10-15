package POO_01;

import java.util.Random;

public class MainCharacter {
	public String name;
	public int hp;
	public int atack;
	public String atackType;
	public String atacksTypes[] = {"Water", "Fire", "Earth", "Air", "Normal"};
	public int defense;
	public int agility;
	public int accuracy;
	public String charactersNames[] = {"Eliwood", "Lyndis", "Hector", "Matthew"};
	
	
	Random aleatorio = new Random();
	
	public MainCharacter() {
		this.name = charactersNames[aleatorio.nextInt(4)];
		this.hp = (aleatorio.nextInt(20)+10);
		this.atack = (aleatorio.nextInt(5)+1);
		this.atackType = atacksTypes[aleatorio.nextInt(4)];
		this.defense = aleatorio.nextInt(10) + 1;		
		this.agility = aleatorio.nextInt(5) + 1;
		this.accuracy = aleatorio.nextInt(15) + 1;	
	}
	
	public String getName() {
		return this.name;
	}
	
	int atackAtual() {
		int atualAtack = aleatorio.nextInt(this.atack + 10);
		return atualAtack;
	}
	
	public int calculateDodgeChance() {
		int dodgeChance = aleatorio.nextInt(6);
		return dodgeChance;
	}
	
	public void checkCharacter() {
		System.out.println("Nome: "+this.name);
		System.out.println("Type: " + this.atackType);
		System.out.println("HP: " + this.hp);
		System.out.println("Atack: " + this.atack);
		System.out.println("Defense: " + this.defense);
		System.out.println("Agility: " + this.agility);
		System.out.println();
	}
}
