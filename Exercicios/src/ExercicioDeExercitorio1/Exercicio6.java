package ExercicioDeExercitorio1;
import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		/*
		 * 6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
		 * P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
		 * A fórmula que efetua tal cálculo é: d = (x2  x1) + (y2 - y1)
		 */
		
		@SuppressWarnings("unused")
		double x1, x2, y1, y2;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor de X1: ");
		x1 = sc.nextDouble();
		
		System.out.println("Entre com o valor de X2: ");
		x2 = sc.nextDouble();
		
		System.out.println("Entre com o valor de Y1: ");
		y1 = sc.nextDouble();
		
		System.out.println("Entre com o valor de Y2: ");
		y2 = sc.nextDouble();
		
		
	}

}
