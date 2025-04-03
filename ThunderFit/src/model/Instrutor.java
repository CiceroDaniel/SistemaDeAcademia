package model;

public class Instrutor extends Usuario{
	//**----------------VARIÀVEIS-------------------**//
	private double salarioFixo;
	
	//**--------------- METODOS ----------------**//
	@Override
	public String gerarCredenciais() {
		return "Nome:" +nome+"\nCPF:" +cpf+"\nEmail:" +email+"\nTelefone:" +telefone+"\nSalario:" +salarioFixo;
	}
	@Override
	public boolean temAcessoAdmin() {
		return true;
	}
	
	
	//**--------------CONSTRUTOR----------------------**//
	public Instrutor(String nome, String cpf, String email, String telefone,double salarioFixo) {
		super(nome, cpf, email, telefone);
		this.salarioFixo=salarioFixo;
		// TODO Auto-generated constructor stub
	}
	

}
