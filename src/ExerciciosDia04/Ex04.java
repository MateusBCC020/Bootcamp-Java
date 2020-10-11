package ExerciciosDia04;

import java.util.Scanner;

/*	4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
	menu de opções:
	(1) somar as duas matrizes
	(2) subtrair a primeira matriz da segunda
	(3) adicionar uma constante as duas matrizes
	(4) imprimir as matrizes
	Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
	da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
	própria matriz.
*/

public class Ex04 {
	public static void main(String[] args) {
		/* 		A = [1][-4]
		 *		    [-2][3]
		 * 
		 * 		B = [2][3]
		 * 			[7][0]
		 * 
		 * 		C = [3][-1]
		 * 			[5][3]
		 * 
		 * */ 

								 
								 
		
		float matrizA[][] = new float[2][2];
		float matrizB[][] = new float[2][2];
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Preencha a primeira matriz");
		
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.printf("Insira o valor da posição [%d][%d]: ", (linha+1), (coluna+1));
				matrizA[linha][coluna] = ler.nextFloat();
			}
		}
		
		System.out.println("\nPreencha a segunda matriz");
		
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.printf("Insira o valor da posição [%d][%d]: ", (linha+1), (coluna+1));
				matrizB[linha][coluna] = ler.nextFloat();
			}
		}
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("\n");
		
		int opcao;
		System.out.println("Escolha a operação que deseja realizar");
		System.out.println("(1) Somar as duas matrizes");
		System.out.println("(2) Subtrair a primeira matriz da segunda");
		System.out.println("(3) Adicionar uma constante as duas matrizes");
		System.out.println("(4) Imprimir as matrizes");
		
		opcao = ler.nextInt();
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("\n");
		if(opcao == 1) {
			float matrizC[][] = new float[2][2];
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
				}
			}
	
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.printf("[%.0f]", matrizC[i][j]);
				}
				System.out.printf("\n");
			}	
		}
		else if(opcao == 2){
			float matrizC[][] = new float[2][2];
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					matrizC[i][j] = matrizB[i][j] - matrizA[i][j];
				}
			}
	
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.printf("[%.0f]", matrizC[i][j]);
				}
				System.out.printf("\n");
			}	
		}
		else if(opcao == 3){	
			float constante;
			System.out.println("Insira o valor da constante: ");
			constante = ler.nextFloat();
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					matrizA[i][j] = matrizA[i][j] * constante;
				}
			}
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					matrizB[i][j] = matrizB[i][j] * constante;
				}
			}
	
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.printf("[%.0f]", matrizA[i][j]);
				}
				System.out.printf("\n");
			}	
			
			System.out.printf("\n");
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.printf("[%.0f]", matrizB[i][j]);
				}
				System.out.printf("\n");
			}
		}
		else if(opcao == 4) {
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.printf("[%.0f]", matrizA[i][j]);
				}
				System.out.printf("\n");
			}	
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.printf("[%.0f]", matrizB[i][j]);
				}
				System.out.printf("\n");
			}
		}
		else {
			System.out.println("Opcao Inválida!");
		}
		
		
		
	}
}
