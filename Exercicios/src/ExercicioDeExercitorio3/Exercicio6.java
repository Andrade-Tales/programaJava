package ExercicioDeExercitorio3;

import java.util.Scanner;

public class Exercicio6 {
	
	/*
	 * 6-	Escrever um programa que receba v�rios n�meros inteiros no teclado.
	 * 		 E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
	 * 		 Para sair digitar 0(zero).(DO...WHILE)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero, soma=0,cont=0;
		
		do {
			
			System.out.println("Digite os numeros");
			numero = sc.nextInt();
			
			
			if (numero % 3== 0 && numero!= 0) {
				cont++;
				
				soma = soma + numero;
				
			}
		}
		
		while(numero !=0);
		
		soma = soma/cont;
		
		System.out.println(soma);
		System.out.println("Contador" +cont);
		
		sc.close();
	}

}