import java.util.Scanner;

public class Exercício_05 {

	public static void main(String[] args) {
		// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário com 2 casas decimais.
		
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
