package ExerciciosDia03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int numero, soma = 0;
		Scanner ler = new Scanner(System.in);
		do {
			System.out.println("Insira um numero: ");
			numero = ler.nextInt();
			soma = soma + numero;
		} while (numero != 0);
		System.out.println("Soma: "+ soma);
	}
}
