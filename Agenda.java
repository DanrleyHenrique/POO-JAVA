package ifrnpoo;

public class Agenda {
	private Contato contatos[];
	private int quantidade;
	
	public Agenda()
	{
		contatos = new Contato[10];
		quantidade = 0;
	}
	
	public void InserirContato(Contato contato)
	{
		contatos[quantidade++] = contato;
	}
	
	public Contato Buscar(String nome)
	{
		for(int i = 0 ; i < quantidade ; i++)
		{
			if(contatos[i].getNome().equals(nome))
			{
				return contatos[i];
			}
		}
		return null;
	}
	
	public void Remover()
	{
		
	}
	
	public int Quantidade()
	{
		return quantidade;
	}
}
