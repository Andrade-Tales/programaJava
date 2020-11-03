package ExercicioDeExercitorio2;
import java.util.*;

public class Exercicio1 {
	public static void main(String[] args) {

		/*
		 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		 */

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int number1, number2, number3;

		int local;

		System.out.print("Digite o primeiro número:   \n");
		number1 = sc.nextInt();

		System.out.print("Digite o segundo número:    \n");
		number2 = sc.nextInt();

		System.out.print("Digite o terceiro número:   \n");
		number3 = sc.nextInt();

		if (number1 > number2)
			local = number1;
		else
			local = number2;

		if (local > number3)
			System.out.printf("O número maior é: %d", local);
		else
			System.out.printf("O número maior é: %d", number3);

	}

}
