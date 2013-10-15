package Agenda;

public class pessoaFisica extends Pessoa{

	//Atributos
	private String cpf;
	private String aniversario;
	private String cargo;
	
	//Construtores
	public pessoaFisica(String nome, String telefone, String endereco,
			String email, String cpf, String aniversario, String cargo) 
	{
		super(nome, telefone, endereco, email);
		// TODO Auto-generated constructor stub
	
	this.cpf = cpf;	
	this.aniversario = aniversario;
	this.cargo = cargo;	
	}
	
	//Getters e Setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}	
}
