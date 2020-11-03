package Heranca;

// DECLARA��O DA CLASSE; HERDANDO DA CLASSE; EXTENDS; (PESSOA) .
public class FuncionarioPessoa extends Pessoa{
	
	private String departamento;
	
	public FuncionarioPessoa(String nome, int matricula, String departamento)
	{
		// SUPER; CRIANDO RELA��O COM A CLASSE PRINCIPAL:
		super(nome, matricula);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	

}
