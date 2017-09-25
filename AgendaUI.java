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
			case 2:
				buscarContato();
				break;
			case 3:
				removerContato();
				break;
			}
		}while(opcao != 0);
	}
	
	private void inserirContato()
	{
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite o telefone");
		String telefone = sc.nextLine();
		Contato novo = new Contato();
		novo.setNome(nome);
		novo.setTelefone(telefone);
		agenda.InserirContato(novo);	
	}
	
	private void buscarContato()
	{
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();
		Contato contato = agenda.Buscar(nome);
		if(contato != null)
			System.out.println(contato);
		else
			System.out.println("Contato não encontrado");
	}
	
	private void removerContato() 
	{
		System.out.println("A ser implementado");
	}
	private void printMenu() 
	{
		System.out.println("\n\n ---- Menu Agenda de contatos v 1.0 ----");
		System.out.println("\n Memória: " + agenda.Quantidade() + " contatos");
		System.out.println("  0 - Sair");
		System.out.println("  1 - Inserir contato");
		System.out.println("  2 - Buscar contato");
		System.out.println("  3 - Remover contato");
		System.out.println("\n  Digite um opçãoo");
	}
}
