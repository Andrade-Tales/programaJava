package Arrays;

import java.util.Scanner;

public class ExercicioArrayLaço2 {
	public static void main(String[] args) {

		/*
		 * 2- O IMC – Índice de Massa Corporal é um critério da Organização Mundial de
		 * Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. A
		 * fórmula é IMC = peso / ( altura )2 Elabore um programa que leia o peso e a
		 * altura de um adulto e mostre sua condição de acordo com a tabela abaixo. IMC
		 * em adultos Condição Abaixo de 18,5 Abaixo do peso Entre 18,5 e 25 Peso normal
		 * Entre 25 e 30 Acima do peso Acima de 30 obeso
		 * 
		 */

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		float IMC, peso = 0, altura = 0;

		System.out.println("Entre com o seu peso: ");
		peso = sc.nextFloat();
		System.out.println("Entre com sua altura: ");
		altura = sc.nextFloat();

		IMC = (peso) / (altura * 2);
		System.out.println("Seu IMC é de: " + IMC);

		if (IMC > 30.0) {
			System.out.println("Você está obeso(a)! ");
		} else if (IMC > 18.5 && IMC < 25.0) {
			System.out.println("Seu peso está normal! ");
		} else if (IMC > 25.0 && IMC < 30.0) {
			System.out.println("Você está acima do peso!");
		} else {
			System.out.println("Você está abaixo do peso normal!");
		}

	}

}
