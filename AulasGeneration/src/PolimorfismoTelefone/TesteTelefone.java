package PolimorfismoTelefone;

public class TesteTelefone {
	public static void main(String[] args) 
	{
		TelefoneCelular celular = new TelefoneCelular();
		TelefoneFixo fixo = new TelefoneFixo();
		TelefonePublico publico = new TelefonePublico();
		
		Telefone telefone = null;
		
		//sistema randomico pra pegar numero
		int n = (int) (Math.random()*3.0); // *3.0 é só pra manipular até onde quero, nao deixar infinito
		System.out.println(n);
		switch(n)
		{
		case 0:
			telefone = celular;
			break;
		case 1:
			telefone = fixo;
			break;
		case 2:
			telefone = publico;
			break;
			default:
				System.out.println("Erro de opção");
		}
		if(telefone!=null)
		{
			telefone.disca("9642 5566");
			telefone.toca(4);
		}
	}

}
