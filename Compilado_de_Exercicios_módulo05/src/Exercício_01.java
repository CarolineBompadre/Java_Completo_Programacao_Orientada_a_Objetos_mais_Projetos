import java.util.Scanner;

public class Exerc�cio_01 {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		if (A < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Positivo");
		}
		
		sc.close();
		
	}

}
