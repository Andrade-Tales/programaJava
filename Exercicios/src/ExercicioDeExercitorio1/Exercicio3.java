package ExercicioDeExercitorio1;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		/*
		 * 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
		 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		 */

		Scanner ler = new Scanner(System.in);
		int dias, anos, meses, idade;

		System.out.println("\n Digite seus dias de vida; ");
		idade = ler.nextInt();

		anos = (idade / 365);
		meses = (idade % 365) / 30;
		dias = (idade % 365) % 30;

		System.out.println("\n Sua idade �; " + anos);
		System.out.println("\n Sua meses �; " + meses);
		System.out.println("\n Sua dias �; " + dias);

		ler.close();

	}

}
