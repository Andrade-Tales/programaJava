package Polimorfismo;

public class Cavalo extends Animal {

	public Cavalo() {

	}

	public String getNome() {

		return "Nome do animal: " + super.getNome() + "Idade do animal: " + super.getIdade()
				+ "Som que o animal emite: " + super.getSom() + "Característica do animal: " + super.getCorrer();

	}

}
