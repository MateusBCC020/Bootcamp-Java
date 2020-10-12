package Projeto_Joguinho_Tesouro;

import java.util.Random;
import java.util.Scanner;

public class Caça_ao_Tesouro {
	
	public static void imprimeTabuleiro(char tabuleiro[]) {
		for(int i = 0; i < tabuleiro.length; i++) {
			System.out.printf("[%c]", tabuleiro[i]);
		}	
		System.out.println();
	}
	
	public static char[] jogada(int posicaoJogada, int posicaoTesouro, char tabuleiro[]) {
		if(posicaoJogada > 10 || posicaoJogada < 1) {
			System.out.println("");
			return tabuleiro;
		}
		
		if(tabuleiro[posicaoJogada] != '-') {
			System.out.println("Opa! Essa posição já foi jogada. Escolha uma nova");
			return tabuleiro;
		}
		
		if(posicaoJogada == (posicaoTesouro)+1) {
			tabuleiro[posicaoJogada-1] = 'O';
			return tabuleiro;
		}else {
			tabuleiro[posicaoJogada-1] = 'X';
			return tabuleiro;
		}	
	}
	
	public static void avisoMantimentos(int numeroTentativas, char tabuleiro[]) {
		if(verificaTabuleiro(tabuleiro) == true) {
			return;
		}	
		if(numeroTentativas == 1) {
			System.out.println("Maldição! demos com os burros n'água...");
		}else if(numeroTentativas == 2) {
			System.out.println("Cuidado com a próxima escolha, seus mantimentos estão acabando");
		}
	}
	
	public static boolean verificaTabuleiro(char tabuleiro[]) {
		boolean vitoria = false;
		for (int i = 0; i < tabuleiro.length; i++) {
			if(tabuleiro[i] == 'O') {
				vitoria = true;
			}
		}
		return vitoria;
	}
	
	
	
	public static void limpa() {
		for (int i = 0; i < 2; i++) {
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		//Vetor é uma fileira de variáveis do mesmo tipo
		//[1][-4][0][2][1]
		
		// Ctrl + espaço = Auto complete
		
		/*Criar um joguinho de caça ao tesouro em que o tesouro
		 *Esteja escondido em uma posição aleatória do nosso tabuleiro
		 *e que o jogador tenha 3 tentativas para descobrir onde está o tesouro
		*/
		
		char tabuleiro[] = new char[10];	
		Scanner ler = new Scanner(System.in);
		int posicaoJogada;
		
		for(int i = 0; i < tabuleiro.length; i++) {
			tabuleiro[i] = '-';
		}
		
		Random aleatorio = new Random();
		int posicaoTesouro;
		posicaoTesouro = aleatorio.nextInt(10);
		//System.out.println(posicaoTesouro);
		int numero_de_jogadas = 0;
		boolean vitoria = false;
		
		//Instruções
		System.out.println("INSTRUÇÕES:");
		System.out.println("Reza a lenda que em uma das 10 ilhas do Arquipélago das Tormentas está escondido o tesouro de Barba Negra.");
		System.out.println("Todos os piratas que foram em busca dessas riquezas, encontraram o castigo do mar");
		System.out.println("Você é o capitão da tripulação mais corajosa dos sete mares e decide sair à procura do tesouro");
		System.out.println("Seu objetivo é procurar o tesouro nas ilhas. Mas cuidado!");
		System.out.println("Seus mantimentos serão suficientes para apenas três tentativas. Escolha sabiamente...");
		
		limpa();
		
		do {
			imprimeTabuleiro(tabuleiro);
			System.out.printf("Escolha a ilha que deseja explorar: ");
			posicaoJogada = ler.nextInt();
			jogada(posicaoJogada, posicaoTesouro, tabuleiro);
			vitoria = verificaTabuleiro(tabuleiro);	
			numero_de_jogadas++;
			System.out.println();
			avisoMantimentos(numero_de_jogadas, tabuleiro);
			limpa();
		} while (numero_de_jogadas < 3 && vitoria == false);
		
		if(vitoria == true) {
			imprimeTabuleiro(tabuleiro);
			System.out.printf("Você encontrou o tesouro! Seu nome estará para sempre na história dos piratas");
		}else {
			imprimeTabuleiro(tabuleiro);
			System.out.println("Famintas e derrotadas, as almas de sua tripulação agora agonizam eternamente no armário de Davy Jones");
		}
		System.out.println("\nFim de jogo!");		
	}
}
