package model;

import java.time.LocalDate;

public abstract class Usuario {
	
	//**----------------VARIÀVEIS-------------------**//
	protected String id;
	protected String nome;
	protected String cpf;
	protected String email;
	protected String telefone;
	protected LocalDate dataDeNascimento;
	protected Endereco endereco;
	protected boolean status;
	protected LocalDate dataDeCadastro;
	
	
	//**--------------CONSTRUTOR----------------------**//
	public Usuario(String nome, String cpf, String email, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.dataDeCadastro = LocalDate.now();
		this.status = true;
	}
	
	//**---------------METODOS ABSTRATOS--------------**//
	public abstract String gerarCredenciais();
	public abstract boolean temAcessoAdmin();
	
	//**--------------METODOS CONCRETOS-------------------**//
	public void desativarUsuario() {
		this.status = false;
	}
	
	public void atualizarEmail(String novoEmail) {
		if(novoEmail != null && !novoEmail.isBlank()) {
			this.email = novoEmail;
		}
	}
	
	public void atualizarTelefone(String novoTelefone) {
		if(novoTelefone != null && !novoTelefone.isBlank()) {
			this.telefone = novoTelefone;
		}
	}
	
	public void atualizarEndereco(String novoEndereco) {
		if(novoEndereco != null && !novoEndereco.isBlank()) {
			this.telefone = novoEndereco;
		}
	}
	
	public int calcularIdade() {
		return LocalDate.now().getYear() - dataDeNascimento.getYear();
	}
	
	//**---------------GETTERS E SETTERS------------------**//
	public String getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf != null && cpf.isBlank()) {
			this.cpf = cpf;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email != null && email.isBlank()) {
			this.email = email;
		}
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if(telefone != null && telefone.isBlank()) {
			this.telefone = telefone;
		}
	}

	
	
	@Override
	public String toString() {
		return "Usuario [id= " + id +", nome= " + nome + ", cpf= " + "]";
	}
	
	
	
}
