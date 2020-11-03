package Exceptions;

public class Erros {
	@SuppressWarnings("null")
	public static void main(String[] args) {

		String frase = null;
		String novaFrase = null;

		try {
			novaFrase = frase.toUpperCase();
		} catch (NullPointerException e) {
			System.out
					.println("Frase inicial é nula, para solucionar o problema" +
			"foi lhe atribuido um valor deafult");
			
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);
	}

}
