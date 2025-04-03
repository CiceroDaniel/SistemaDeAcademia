package model;

public class Endereco {
	//**----------------VARIÀVEIS-------------------**//
	private String rua;
	private String numero;
	private String cidade;
	
	//**--------------CONSTRUTOR----------------------**//
	public Endereco(String rua, String numero, String cep, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
	}
	
	public String toFileString1() {
		return String.join("|", rua, numero, cidade);
	}
	
	public Endereco fromFileString1(String str) {
		String[] partes = str.split("\\|");
		this.rua = partes[0];
		this.numero = partes[1];
		this.cidade = partes[2];
		return this;
	}
	

	
	//**---------------GETTERS E SETTERS------------------**//
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getNumeroCasa() {
		return numero;
	}
	
	public void setNumeroCasa(String numeroCasa) {
		this.numero = numeroCasa;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

//olhar essa parte
	public CharSequence toFileString() {
		// TODO Auto-generated method stub
		return null;
	}

	public Endereco fromFileString(String string) {
		// TODO Auto-generated method stub
		return null;
	}



	
	
	
}