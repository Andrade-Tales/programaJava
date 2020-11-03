package ExercicioDeExercitorio3;

import java.util.*;

public class Exercicio2 {
	public static void main(String[] args) {
		/*
		 * Exercício 2-Ler 10 números e imprimir quantos são pares e quantos são
		 * ímpares. (FOR)
		 */

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int i, contPar = 0, contImpar = 0, num;

		for (i = 1; i <= 10; i++) {
			System.out.println("Informe um numero: ");
			num = sc.nextInt();

			if (num % 2 == 0) {

				contPar++;

			} else {
				contImpar++;
			}
		}
		System.out.println("Os Pares são:" + contPar);
		System.out.println("Os Impares são:" + contImpar);
		sc.close();

	}

}
