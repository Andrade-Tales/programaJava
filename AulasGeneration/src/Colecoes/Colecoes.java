package Colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) {

		Collection<String> nomes = new ArrayList();

		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Juliana");
		nomes.add("Rafaela");

		/*
		 * Mostrando os nomes do Array por sequência for(String name : nomes) {
		 * System.out.println("Lista de nomes: " + name); }
		 */

		/*
		 * Adicionando um ArrayList a outro ArrayList Collection<String> nomes2 =
		 * Arrays.asList("João, Joana"); nomes.addAll(nomes2);
		 * System.out.println("Lista de nomes: " + nomes);
		 * 
		 */

		/*
		 * Verificando se na lista tem o nome "Maria" usando "contains"
		 * System.out.println("Contém o nome Maria? " + nomes.contains("Maria"));
		 * System.out.println("Lista de nomes: " + nomes);
		 */

		/*
		 * Rodando a lista e depois limpando com clear
		 * System.out.println("Lista de nomes: " + nomes); nomes.clear();
		 * System.out.println("Lista de nomes: " + nomes);
		 */

		/*
		 * Removendo uma posição da lista com "remove"
		 * System.out.println("Lista de nomes: " + nomes); nomes.remove("Mario");
		 * System.out.println("Lista de nomes: " + nomes);
		 */

		/*
		 * Se o nome da lista estiver vazia mostrar "Lista vazia" se não, mostrar
		 * "Lista de nomes" if(nomes.isEmpty()) { System.out.println("Lista vazia...");
		 * } else { System.out.println("Lista de nomes: " + nomes); }
		 * 
		 * 
		 */
	}

}
