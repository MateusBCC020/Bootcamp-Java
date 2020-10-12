package Projeto_Joguinho_Tesouro;

import java.util.Random;
import java.util.Scanner;

public class Caça_ao_Tesouro {
	
	/*Essa função recebe a posição que o usuário quer jogar e verifica se é a posição em que o tesouro está.
	 * Caso seja, marca a posicao com o caracter 'O', caso contrário, marca a posição jogada com o caracter
	 * 'X' indicando que o usuário errou
	 * */
	public static char[] jogada(int posicao, char[] tabuleiro, int posicaoTesouro) {
		if(posicao > tabuleiro.length || posicao < 0) {
			System.out.println("Opa! Essa posicao não existe. Escolha uma nova");
			return tabuleiro;
		}
		
		if (tabuleiro[posicao] != '-') {
			System.out.println("Opa! Você já escolheu essa posição. Escolha uma nova");
			return tabuleiro;
		}
		
		if(posicao == posicaoTesouro) {
			tabuleiro[posicao] = 'O';
		}
		else {
			tabuleiro[posicao] = 'X';
		}
		return tabuleiro;
	}
	
	
	//Essa função recebe o tabuleiro e imprime na tela
	public static void imprimeTabuleiro(char[] tabuleiro, int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			System.out.printf("[%c]", tabuleiro[i]);
		}
		System.out.println("\n");
	}
	
	
	//Essa função verifica se o caracter 'O' existe no tabuleiro,
	//caso exista, ela retorna a variável vitória com o valor true.
	public static boolean verificaTabuleiro(char[] tabuleiro, int tamanho) {
		boolean vitoria = false;
		for (int i = 0; i < tamanho; i++) {
			if(tabuleiro[i] == 'O') {
				vitoria = true;
			}
		}
		return vitoria;
	}
	
	
	public static void main(String[] args) {
		//O vetor de char será o tabuleiro do joguinho
		char vetor[] = new char[10];
		Scanner ler = new Scanner(System.in);
		int posicao;
		
		//Esse trecho serve para sortear a posição em que o tesouro vai estar no tabuleiro
		Random aleatorio = new Random();
		int posicaoTesouro = aleatorio.nextInt(10);
		//System.out.println(posicaoTesouro);
		
		//Esse laço preenche o tabuleiro com o caracter hífem. As posições em que o caracter
		//hífem estiver presente são as posições que ainda não foram jogadas.
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = '-';
		}
		
		boolean vitoria;
		int numero_de_jogadas = 0;
		
		//Esse laço repete o jogo enquanto o número de jogadas for menor que
		//e enquanto o jogador não acertar a posição do tesouro.
		do {
			imprimeTabuleiro(vetor, vetor.length);
			System.out.println("Digite a posição que deseja jogar: ");
			posicao = ler.nextInt();
			jogada(posicao, vetor, posicaoTesouro);
			vitoria = verificaTabuleiro(vetor, vetor.length);
			numero_de_jogadas++;
		} while (vitoria != true && numero_de_jogadas < 3);
		
		imprimeTabuleiro(vetor, vetor.length);
		
		if(vitoria == true) {
			System.out.println("Você ganhou! Você é o rei dos piratas");
		}else {
			System.out.println("Você perdeu! Saquearam seu tesouro");
		}
	}
}
