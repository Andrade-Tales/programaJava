package LacoDeRepeticao;

import java.util.Scanner;

public class Repeticao3 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int idade;
		System.out.printf("\n Entre com a sua idade: ");

		idade = sc.nextInt();
		do {

			System.out.printf("\n Sua idade: %d", idade);
			if (idade >= 18) {

				System.out.printf("\n Você é de maior!");
			} else {
				System.out.printf("\n Você é de menor!");

			}
			System.out.printf("\n Entre com a sua idade: ");

			idade = sc.nextInt();

		} while (idade >= 1);
	}

}
