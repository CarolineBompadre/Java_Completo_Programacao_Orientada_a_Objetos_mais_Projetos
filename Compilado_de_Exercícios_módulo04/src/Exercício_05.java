import java.util.Scanner;

public class Exerc�cio_05 {

	public static void main(String[] args) {
		// Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio com 2 casas decimais.
		
		Scanner sc = new Scanner(System.in);
		
		int numeroDoFuncionario;
		int horasTrabalhadas;
		double valorHora;
		double salario;
		
		numeroDoFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMERO DO FUNCIONARIO = " + numeroDoFuncionario);
		System.out.printf("SALARIO = %.2f%n", salario);		
		
		sc.close();

	}

}
