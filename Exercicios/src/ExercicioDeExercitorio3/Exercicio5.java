package ExercicioDeExercitorio3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		/*
		 * 5- Crie um programa que leia um número do teclado até que encontre um número
		 * igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE).
		 */

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int numero, soma = 0;

		do {
			System.out.println("Digite os numeros: ");
			numero = sc.nextInt();

			soma = soma + numero;

		} while (numero != 0);

		System.out.println("\nA soma dos numeros é: " + soma);
		sc.close();
	}

}
