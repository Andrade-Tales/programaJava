package ExercicioDeExercitorio3;

import java.util.*;

public class Exercicio2 {
	public static void main(String[] args) {
		/*
		 * Exerc�cio 2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o
		 * �mpares. (FOR)
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
		System.out.println("Os Pares s�o:" + contPar);
		System.out.println("Os Impares s�o:" + contImpar);
		sc.close();

	}

}
