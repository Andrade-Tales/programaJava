package ExercicioDeExercitorio2;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		/*
		 * 4 - Faça um programa em que permita a entrada de um número qualquer e exiba
		 * se este número é par ou ímpar. Se for par exiba também a raiz quadrada do
		 * mesmo; se for ímpar exiba o número elevado ao quadrado.
		 */

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double num;

		System.out.println("Entre com um número: ");
		num = sc.nextInt();

		if (num % 2 == 0) {

			num = Math.sqrt(num);
			
			System.out.println("É número par...");
			
		} else {
			
			num = Math.pow(num, 2);
			System.out.println("É número ímpar...");
		}

		System.out.printf("\nValor de NUM: %5.2f", num);

	}

}
