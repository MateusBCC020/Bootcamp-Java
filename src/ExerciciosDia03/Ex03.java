package ExerciciosDia03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int idade = 0, total=0;
		Scanner ler = new Scanner(System.in);
		while(idade != -99) {
			System.out.println("Insira a idade: ");
			idade = ler.nextInt();
			if(idade >= 21)
					total++;
		}
		System.out.println("O total de pessoas com 21 anos ou mais é: " + total);
	}
}
