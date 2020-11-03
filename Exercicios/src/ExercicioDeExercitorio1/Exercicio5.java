package ExercicioDeExercitorio1;
import java.util.Scanner;
public class Exercicio5 {
	
	public static void main(String[] args) {
		
		
		/*
		 * 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
		 */
		
		String nome = null;
		double nota1, nota2, nota3, media;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a nota 1: ");
		nota1 = sc.nextDouble();
		System.out.println("Entre com a nota 2: ");
		nota2 = sc.nextDouble();
		System.out.println("Entre com a nota 3: ");
		nota3 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		if(media >= 7.0)
		{
			System.out.printf("\nAluno: ", nome, "Parabéns você foi aprovado com nota: ", media);
		}
		//if  (media = >= 4.0 && media <7)
		{
			
		}
		
		
		
		
	}

}
