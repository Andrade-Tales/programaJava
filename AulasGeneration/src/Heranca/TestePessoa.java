package Heranca;

public class TestePessoa {
	public static void main(String[] args) {
		
		
		Pessoa jessica = new Pessoa("Jessica", 555);
		FuncionarioPessoa pedro = new FuncionarioPessoa("Pedro", 222, "TI");
		Pessoa maria = new FuncionarioPessoa("Maria", 333, "Informátiica.Desenvolvimento");
		Pessoa jose = new Coordenador("José", 444, "CC");
		
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());
	}

}
