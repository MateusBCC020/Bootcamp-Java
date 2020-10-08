package ExerciciosDia02;

import java.util.*;

public class Ex02 {
	public static void main(String[] args) {
		int n = 0;
		int temporaria;
		System.out.println("Quantos numeros deseja inserir: ");
		Scanner ler = new Scanner(System.in);
		n = ler.nextInt();
		int vetor[] = new int[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Insira o %dº valor: ", (i+1));
			vetor[i] = ler.nextInt();
		}
		
		for (int i = 0; i < vetor.length - 1; i++) {
			for (int j = 0; j < vetor.length - i - 1; j++) {
				if(vetor[j] > vetor[j+1])
				{
					temporaria = vetor[j+1];
					vetor[j+1] = vetor[j];
					vetor[j] = temporaria;
				}
			}
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf(" %d ", vetor[i]);
		} 
		
	}
}
