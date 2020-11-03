package ExercicioDeExercitorio1;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		/*
		 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		 * expressa em anos, meses e dias.
		 */

		Scanner sc = new Scanner(System.in);
		int dias, idade, mes, ano;

		System.out.println("Entre com a idade em dias: ");

		dias = sc.nextInt();
		ano = (dias / 365);
		mes = (dias % 365) / 30;
		idade = (dias % 365) % 30;

		System.out.println("\nSua idade é: " + idade);
		System.out.println("\nMês em que nasceu é: " + mes);
		System.out.println("\nAno em que nasceu é: " + ano);

		sc.close();

	}

}
