package Agenda;

public class pessoaJuridica extends Pessoa{
	
	//Atributos
	private String cnpj;
	private String site;
	
	//Construtores
	public pessoaJuridica(String nome, String telefone, String endereco,
			String email, String cnpj, String site) 
	{
		super(nome, telefone, endereco, email);
		// TODO Auto-generated constructor stub
	this.cnpj = cnpj;
	this.site = site;
	}
	
	//Getters e Setters
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	
}
