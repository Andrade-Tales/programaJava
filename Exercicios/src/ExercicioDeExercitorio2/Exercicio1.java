package ExercicioDeExercitorio2;
import java.util.*;

public class Exercicio1 {
	public static void main(String[] args) {

		/*
		 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		 */

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int number1, number2, number3;

		int local;

		System.out.print("Digite o primeiro n�mero:   \n");
		number1 = sc.nextInt();

		System.out.print("Digite o segundo n�mero:    \n");
		number2 = sc.nextInt();

		System.out.print("Digite o terceiro n�mero:   \n");
		number3 = sc.nextInt();

		if (number1 > number2)
			local = number1;
		else
			local = number2;

		if (local > number3)
			System.out.printf("O n�mero maior �: %d", local);
		else
			System.out.printf("O n�mero maior �: %d", number3);

	}

}
