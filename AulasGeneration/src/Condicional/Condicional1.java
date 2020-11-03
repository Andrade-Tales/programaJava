package Condicional;

import java.util.*;

public class Condicional1 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int idade;
		String nome;

		System.out.println("Entre com a sua idade: ");
		idade = sc.nextInt();

		sc.nextLine();

		System.out.println("Entre com seu nome: ");
		nome = sc.nextLine();

		System.out.printf("\nSeu nome: %s", nome);
		System.out.printf("\nSua idade: %d", idade);

		if (idade >= 18) {
			System.out.printf("\nVocê é maior de idade!");
		}

		else if (idade >= 1 && idade < 18) {
			System.out.printf("\nVocê é menor de idade!");
		} else {
			System.out.printf("\nVocê entrou com uma idade inválida!");
		}
	}

}
