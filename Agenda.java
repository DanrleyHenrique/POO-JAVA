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
	
	public void BuscarParaRemocao(String nome)
	{
		if(quantidade == 0)
		{
			System.out.println("Agenda vazia");
		}
		else 
		{
		
			for(int i = 0 ; i < quantidade ; i++)
			{
				if(contatos[i].getNome().equals(nome))
				{
					Remover(i);
				}
				
			}
		}
		
	}
	
	public void RemoverUltimo()
	{
		contatos[quantidade-1].setNome(null);
		contatos[quantidade-1].setTelefone(null);
		quantidade--;
	}
	
	public void Remover(int indice)
	{
		if(indice == 0)
		{
			for(int i = 0; i < quantidade-1; i++) 
			{
				contatos[indice].setNome(contatos[indice+1].getNome());
				contatos[indice].setTelefone(contatos[indice+1].getTelefone());
				indice++;
			}
		}
		else
		{
			for(int i = quantidade - indice; i < quantidade; i++) 
			{
				contatos[indice].setNome(contatos[indice+1].getNome());
				contatos[indice].setTelefone(contatos[indice+1].getTelefone());
				indice++;
			}
		}
		RemoverUltimo();
	}
	
		
	public String getContato(int i)
	{
		String c;
		c = contatos[i].getNome() + " " + contatos[i].getTelefone();
		return c;
	}
	
	public int getQuantidade()
	{
		return quantidade;
	}
}
