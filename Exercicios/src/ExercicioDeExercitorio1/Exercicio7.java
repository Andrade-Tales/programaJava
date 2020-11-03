package ExercicioDeExercitorio1;
import java.util.Scanner;

public class Exercicio7 {
	
	/*
	 * 7. Um sistema de equações lineares do tipo:  pode ser resolvido segundo mostrado abaixo : 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, e, f;
		double x, y;
		
		System.out.println("Digite o valor de A:");
		a = sc.nextInt();
		System.out.println("Digite o valor de B:");
		b = sc.nextInt();
		System.out.println("Digite o valor de C:");
		c = sc.nextInt();
		System.out.println("Digite o valor de D:");
		d = sc.nextInt();
		System.out.println("Digite o valor de E:");
		e = sc.nextInt();
		System.out.println("Digite o valor de F:");
		f = sc.nextInt();
		
		x = (((c * e)-(b * f)) / ((a * e)-(b * d)));
		y = (((a * f)-(c * d)) / ((a * e)-(b * d)));
		
		System.out.println("O valor de X é: "+ x);
		System.out.println("O valor de Y é: "+ y);
		
		sc.close();
	}

}
