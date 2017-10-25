package Tarefas;
import java.util.Scanner;
import java.io.*; 

public class ListaDeTarefasUI {
	private ListaDeTarefas lista;
	private Scanner sc;
	
	public void UI()
	{
		lista = new ListaDeTarefas();	
	}
	
	public void Run() throws IOException
	{
		sc = new Scanner(System.in);
		int opcao = 0;
		do
		{
			printMenu();
			opcao = sc.nextInt();
			switch(opcao)
			{
				case 1:
					inserirTarefa();
					break;
				case 2:
					listarTarefas();
					break;
				case 3:
					removerUltimo();
					break;
				case 4:
					removerPorNome();
					break;
			}
		}while(opcao != 0);
		System.out.println("Fim de execução!\n");
	}
	

	private void removerPorNome() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Insira o nome da tarefa a ser removida");
		String nome = br.readLine();
		lista.removerPorNome(nome);
	}

	private void removerUltimo() 
	{
		if(lista.getQuantidade() > 0)
			lista.removerUltimo();
		else
			System.out.println("Agenda vazia!\n");
	}

	private void inserirTarefa() throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Tarefa nova = new Tarefa();
		System.out.println("Insira um nome para a tarefa");
		String nome = br.readLine();
		System.out.println("Insira grau de prioridade\n1)Muito importante\n2)Importância media");
		System.out.println("3)Pouco importante");
		int imp = sc.nextInt();
		System.out.println("Descreva a tarefa");
		String descricao = br.readLine();
		nova.setNome(nome);
		nova.setPrioridade(imp);
		nova.setDescricaoTarefa(descricao);
		lista.InserirTarefa(nova);
	}

	private void listarTarefas() 
	{
		if(lista.getQuantidade() == 0)
		{
			System.out.println("Lista sem tarefas");
		}
		else
		{
			for(int i = 0 ; i < lista.getQuantidade() ; i++)
			{
				System.out.println(lista.getTarefa(i));
			}
		}
	}
	
	private void printMenu()
	{
		if(lista.getQuantidade() == 0)
		{
			System.out.println("Lista de Tarefas v1.0");
			System.out.println("----------------------");
			System.out.println("Lista vazia");
			System.out.println("----------------------");
			System.out.println("0) Sair");
			System.out.println("1) Inserir tarefa");
		}
		else if(lista.getQuantidade() == 1)
		{
			System.out.println("Lista de Tarefas v1.0");
			System.out.println("----------------------");
			System.out.println("Você possui "+lista.getQuantidade()+" tarefa");
			System.out.println("----------------------");
			System.out.println("0) Sair");
			System.out.println("1) Inserir tarefa");
			System.out.println("2) Listar tarefa");
			System.out.println("3) Remover única tarefa");
		}
		else
		{
			System.out.println("Lista de Tarefas v1.0");
			System.out.println("----------------------");
			System.out.println("Você possui "+lista.getQuantidade()+" tarefas");
			System.out.println("----------------------");
			System.out.println("0) Sair");
			System.out.println("1) Inserir tarefa");
			System.out.println("2) Listar tarefas");
			System.out.println("3) Remover tarefa de menor prioridade");
			System.out.println("4) Remover tarefa por nome");
		}
	}
}
