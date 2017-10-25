package Tarefas;

public class Tarefa {
	private int prioridade;
	private String nome;
	private String DescricaoTarefa;
	
	public int getPrioridade()
	{
		return prioridade;
	}
	public void setPrioridade(int prioridade)
	{
		this.prioridade = prioridade;
	}
	public String getDescricaoTarefa()
	{
		return DescricaoTarefa;
	}
	public void setDescricaoTarefa(String DescricaoTarefa)
	{
		this.DescricaoTarefa = DescricaoTarefa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
