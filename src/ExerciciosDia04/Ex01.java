package ExerciciosDia04;

public class Ex01 {
	public static void main(String[] args) {
		int A[] = {1,0,5,-2,-5,7};
		int soma = 0;
		soma = A[0] + A[1] + A[5];

		System.out.println("A soma é: " + soma);
		A[4] = 100;
		
		for (int i = 0; i < A.length; i++) {
			System.out.printf("A[%d]%d\n", i,A[i]);
		}
		
	}
}
