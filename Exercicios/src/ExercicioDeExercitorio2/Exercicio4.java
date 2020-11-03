package ExercicioDeExercitorio2;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		/*
		 * 4 - Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba
		 * se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do
		 * mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
		 */

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double num;

		System.out.println("Entre com um n�mero: ");
		num = sc.nextInt();

		if (num % 2 == 0) {

			num = Math.sqrt(num);
			
			System.out.println("� n�mero par...");
			
		} else {
			
			num = Math.pow(num, 2);
			System.out.println("� n�mero �mpar...");
		}

		System.out.printf("\nValor de NUM: %5.2f", num);

	}

}
