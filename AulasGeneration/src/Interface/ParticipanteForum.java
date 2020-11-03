package Interface;

public class ParticipanteForum implements Leitor, Programador{
	
	String pensamento;
	public String lendo()
	{
		return "Fórum";
	}
	
	public void pensando(char[] ideias)
	{
		pensamento = new String (ideias);	
	}
	
	public String digitando()
	{
		return pensamento;
	}
	
	@SuppressWarnings("unused")
	private String aprendendo()
	{
		return "JAVA";
	}
}
