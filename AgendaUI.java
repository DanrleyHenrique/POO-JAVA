package ifrnpoo;

import java.util.Scanner;

public class AgendaUI {
	private Agenda agenda;
	private Scanner sc;
	
	public void UI()
	{
		agenda = new Agenda();
	}
	
	public void Run()
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
				inserirContato();
				break;
			case 3:
				listarContato();
				break;
			case 2:
				buscarContato();
				break;
			case 4:
				removerUltimoContato();
				break;
			case 5:
				buscarContatoParaRemocao();
				break;
			}
		}while(opcao != 0);
		System.out.println("Fim de execução!");
	}
	
	private void inserirContato()
	{
		Contato novo = new Contato();
		System.out.println("Digite o nome: ");
		String nome = sc.next();
		System.out.println("Digite o telefone: ");
		String telefone = sc.next();
		novo.setNome(nome);
		novo.setTelefone(telefone);
		agenda.InserirContato(novo);	
	}
	
	private void listarContato() 
	{
		for(int i = 0; i < agenda.Quantidade(); i++)
		{
			System.out.println(agenda.getContato(i));
		}
	}
	
	private Contato buscarContato()
	{
		System.out.println("Digite o nome: ");
		String nome = sc.next();
		Contato contato = agenda.Buscar(nome);
		if(contato != null) 
			System.out.println(contato);
		else
			System.out.println("Contato não encontrado");
		return contato;
	}
	
	private void buscarContatoParaRemocao()
	{
		System.out.println("Digite o nome: ");
		String nome = sc.next();
		int i = agenda.BuscarParaRemocao(nome);
		if(i != -1) 
			agenda.Remover(i);
		else
			System.out.println("Contato não encontrado");
		
	}
	
	private void removerUltimoContato() 
	{
		if(agenda.getQuantidade() == 0) 
		{
			System.out.println("Agenda vazia");
		}
		else
		{
			System.out.println("Insira o nome do indivíduo");
			agenda.RemoverUltimo();
			System.out.println("Contato removido");
		}
	}
	private void printMenu() 
	{
		System.out.println("\n\n ---- Menu Agenda de contatos v 1.0 ----");
		System.out.println("\n Memória: " + agenda.Quantidade() + " contatos");
		System.out.println("  0 - Sair");
		System.out.println("  1 - Inserir contato");
		System.out.println("  2 - Buscar contato");
		System.out.println("  3 - Listar contato");
		System.out.println("  4 - Remover ultimo contato");
		System.out.println("  5 - Remover por nome");
		System.out.println("\n  Digite um opção");
	}
}
