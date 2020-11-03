package PolimorfismoTelefone;

public class TelefoneCelular extends Telefone{
	public TelefoneCelular()
	{
		super("Celular");
	}
	public void toca(int codigoToque)
	{
		switch(codigoToque)
		{
		case 1:
			System.out.println("Trim...trim...trim");
			break;
		case 2:
			System.out.println("Toc...toc...toc");
			break;
			default:
				System.out.println("Salve o Tricolor Paulista...");
				break;
		}
	}
	public void disca(String numero)
	{
		System.out.println("Discando: "+numero+" � um celular");
	}

}