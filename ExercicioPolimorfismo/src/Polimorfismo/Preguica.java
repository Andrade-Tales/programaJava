package Polimorfismo;

public class Preguica extends Animal {

	public Preguica() {

	}

	public String getNome() {

		return "Nome do animal: " + super.getNome() + "Idade do animal: " + super.getIdade()
				+ "Som que o animal emite: " + super.getSom() + "CaracterÝstica do animal: " + super.getEscalar();

	}

}
