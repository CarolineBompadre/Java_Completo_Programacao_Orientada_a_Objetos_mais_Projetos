import java.util.Scanner;
public class Exercicio_06 {

	public static void main(String[] args) {
		// Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		
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
