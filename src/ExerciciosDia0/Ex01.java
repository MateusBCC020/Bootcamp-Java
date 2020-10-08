package ExerciciosDia0;

import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		int idadeAnos, idadeMeses, idadeDias, idadeFinal;
		System.out.println("Digite sua idade em anos: ");
		Scanner scanf = new Scanner(System.in);
		idadeAnos = scanf.nextInt();
		System.out.println("Digite os meses: ");
		idadeMeses = scanf.nextInt();
		System.out.println("Digite os dias: ");
		idadeDias = scanf.nextInt();
		idadeFinal = idadeAnos * 365;
		idadeFinal = idadeFinal + idadeMeses * 30;
		idadeFinal = idadeFinal + idadeDias;
		//Scanner ler = new Scanner(System.in);
		
		System.out.println("Sua idade em dias é: " + idadeFinal);
	}
}
