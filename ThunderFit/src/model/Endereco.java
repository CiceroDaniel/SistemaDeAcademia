package model;

public class Endereco {
	//**----------------VARIÀVEIS-------------------**//
	private String rua;
	private String numeroCasa;
	private String cep;
	private String cidade;
	private String estado;
	
	//**--------------CONSTRUTOR----------------------**//
	public Endereco(String rua, String numeroCasa, String cep, String cidade, String estado) {
		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.cep =cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	
	//**---------------GETTERS E SETTERS------------------**//
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getNumeroCasa() {
		return numeroCasa;
	}
	
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
	
}