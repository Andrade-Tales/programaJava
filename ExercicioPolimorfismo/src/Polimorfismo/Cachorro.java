package Polimorfismo;

public class Cachorro extends Animal {

	public Cachorro() {
	}

	public String getNome() {

		return "Nome do animal: " + super.getNome() + "Idade do animal: " + super.getIdade()
				+ "Som que o animal emite: " + super.getSom() + "CaracterÝstica do animal: " + super.getCorrer();

	}
}