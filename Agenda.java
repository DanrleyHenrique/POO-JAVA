package helloworld;
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
		}
	}
}
