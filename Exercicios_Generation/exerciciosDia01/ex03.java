package exerciciosDia1;

import java.util.Scanner;
public class ex03 {
	public static void main(String[] args) {
		int tempoSegundos, hora, minuto, segundo;
		System.out.println("Insira o tempo de duração em segundos: ");
		Scanner ler = new Scanner(System.in);
		tempoSegundos = ler.nextInt();
		hora = tempoSegundos / 3600;
		minuto = (tempoSegundos % 3600)/60;
		segundo = (tempoSegundos % 3600)%60;
		System.out.println("Ao todo foram " + hora + " hora(s), " + minuto + " minuto(s) e " + segundo + " segundo(s)");
		
	}
}
