import java.util.Scanner;

public class Exerc�cio_05 {

	public static void main(String[] args) {
		// Com base na tabela abaixo, escreva um programa que leia o c�digo de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		//C�digo -- Produto         -- Valor
		// 1		Cachorro-Quente		4,00
		// 2		X-Salada			4,50
		// 3		X-Bacon				5,00
		// 4		Torrada Simples		2,00
		// 5		Refrigerante		1,50
		
		Scanner sc = new Scanner (System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

	}

}
