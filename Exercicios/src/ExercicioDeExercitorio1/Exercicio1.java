package ExercicioDeExercitorio1;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		/*
		 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		 * dias e mostre-a expressa apenas em dias.
		 */
		Scanner sc = new Scanner(System.in);

		int idade, dias, meses, anos;

		System.out.println("Digite a idade em anos: ");
		idade = sc.nextInt();
		System.out.println("Digite o mês atual: ");
		meses = sc.nextInt();
		System.out.println("Digite o dia atual: ");
		dias = sc.nextInt();

		anos = (idade * 365) + (meses * 30) + dias;

		System.out.println("Seu tempo de vida em dias é: " + anos);

		sc.close();
	}
}
