import java.util.Scanner;
public class Exercicio_06 {

	public static void main(String[] args) {
		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, numeroPecas1, numeroPecas2;
		double valorUnitario1, valorUnitario2;
		
		cod1 = sc.nextInt();
		numeroPecas1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		cod2 = sc.nextInt();
		numeroPecas2 = sc.nextInt(); 
		valorUnitario2 = sc.nextDouble();
		
		double valorTotal1 = valorUnitario1 * numeroPecas1;
		double valorTotal2 = valorUnitario2 * numeroPecas2;
		double valorAPagar = valorTotal1 + valorTotal2;
		
		System.out.printf("Valor a pagar = %.2f%n", valorAPagar);		
		
		sc.close();

	}

}
