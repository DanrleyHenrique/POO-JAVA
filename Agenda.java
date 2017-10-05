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
	
	public int BuscarParaRemocao(String nome)
	{
		for(int i = 0 ; i < quantidade ; i++)
		{
			if(contatos[i].getNome().equals(nome))
			{
				return i;
			}
		}
		return -1;
	}
	
	public void RemoverUltimo()
	{
		contatos[quantidade-1].setNome(null);
		contatos[quantidade-1].setTelefone(null);
		quantidade--;
	}
	
	public void Remover(int indice)
	{
		for(int i = quantidade - indice; i < quantidade; i++)
		{
			contatos[indice].setNome(contatos[indice+1].getNome());
			contatos[indice].setTelefone(contatos[indice+1].getNome());
			indice++;
		}
		RemoverUltimo();
	}
	
	public int Quantidade()
	{
		return quantidade;
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
