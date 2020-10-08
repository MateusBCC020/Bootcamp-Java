package ExerciciosDia0;

import java.lang.*;
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		double numero[] = new double[4];
		Scanner ler = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("Insira o " + (i+1) + "º numero: ");
			numero[i] = ler.nextDouble();
		}
		
		numero[3] = (Math.pow(numero[0]+numero[1], 2) + Math.pow(numero[1]+numero[2], 2))/2;
		System.out.println("Resultado: " + numero[3]);		
	}
}
