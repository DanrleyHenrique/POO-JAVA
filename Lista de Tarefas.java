package Tarefas;

public class ListaDeTarefas {
	private Tarefa tarefas[];
	private Tarefa tarefasAux[];
	private int quantidade;
	private int TamanhoMaximoDaLista;
	
	public ListaDeTarefas()
	{
		tarefas = new Tarefa[2];
        TamanhoMaximoDaLista = 2;
		quantidade = 0;
	}
	
	public void InserirTarefa(Tarefa tarefa)
	{
		tarefas[quantidade++] = tarefa;
		if(quantidade == TamanhoMaximoDaLista)
		{
			tarefasAux = new Tarefa[TamanhoMaximoDaLista + 2];
			for(int i = 0 ; i < TamanhoMaximoDaLista ; i++)
			{
				tarefasAux[i] = tarefas[i];
			}
			TamanhoMaximoDaLista += 2;
			tarefas = new Tarefa[TamanhoMaximoDaLista];
			for(int i = 0 ; i < TamanhoMaximoDaLista ; i++)
			{
				tarefas[i] = tarefasAux[i];
			}
		}
		
		if(quantidade > 1)
		{
			Tarefa aux;
			for(int i = 0 ; i < quantidade ; i++)
			{
				for(int x = i ; x < quantidade ; x++)
				{
					if(tarefas[i].getPrioridade() > tarefas[x].getPrioridade())
					{
						aux = tarefas[i];
						tarefas[i] = tarefas[x];
						tarefas[x] = aux;
					}
					else
					{
						
					}		
				}
			}
		}
	}
	
	public String getTarefa(int i)
	{
		String s;
		s = "Tarefa de nome: "+ tarefas[i].getNome()+"\nPrioridade nível: " +tarefas[i].getPrioridade()+"\nDescrição: "+tarefas[i].getDescricaoTarefa()+"\n";
		return s;
	}
	
	public int getQuantidade()
	{
		return quantidade;
	}
	
	public void removerUltimo()
	{
		tarefas[quantidade--] = null;	
	}
	public void removerPorNome(String nome)
	{
		for(int i = 0 ; i < quantidade ; i++)
		{
			if(tarefas[i].getNome().equals(nome))
			{
				for(int k = i ; k < quantidade-11 ; k++)
				{
					tarefas[k] = tarefas[k+1];
				}
			}
		}
		removerUltimo();
	}
}

