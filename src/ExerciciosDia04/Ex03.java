package ExerciciosDia04;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.printf("insira o valor da posição [%d][%d]: ", i, j);
				matriz[i][j] = ler.nextInt();
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.printf("%d ", matriz[i][j]);
			}
			System.out.println("\n");
		}
	}
}
