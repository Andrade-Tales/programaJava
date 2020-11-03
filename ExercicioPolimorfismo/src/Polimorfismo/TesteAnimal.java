package Polimorfismo;

public class TesteAnimal {
	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Plutus.\n");
		cachorro.setIdade("O animal tem idade de 3 ano \n");
		cachorro.setSom("O animal late.\n");
		cachorro.setCorrer("O animal corre.\n");

		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Pangaré.\n");
		cavalo.setIdade("O animal tem idade de 8 anos\n");
		cavalo.setSom("O animal rilincha.\n");
		cavalo.setCorrer("O animal corre.\n");

		Preguica preguica = new Preguica();
		preguica.setNome("Flash.\n");
		preguica.setIdade("O animal tem idade de 4 anos\n");
		preguica.setSom("O animal emite sons de alta-frequência pelas narinas.\n");
		preguica.setEscalar("O animal escala árvores.\n");

		Animal[] animal = new Animal[3];
		animal[0] = cachorro;
		animal[1] = cavalo;
		animal[2] = preguica;
		
		for(Animal animal1: animal)
		{
			System.out.println(animal1.getNome());
		}
	}

}
