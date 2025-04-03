package model;

public class Administrador extends Usuario{

	//**----------------VARIÀVEIS-------------------**//
	Administrador adm;
	private String senhaMestre;
	
	//**--------------- METODOS ----------------**//
	@Override
	public String gerarCredenciais() {
		return null;
	}
	@Override
	public boolean temAcessoAdmin() {
		return true;
	
	}
	
	//**--------------CONSTRUTOR----------------------**//
	public Administrador(String nome, String cpf, String email, String telefone,String senhaMestre) {
		super(nome, cpf, email, telefone);
		this.senhaMestre=senhaMestre;
		// TODO Auto-generated constructor stub
	}
	
	//**---------------GETTERS E SETTERS------------------**//

	public String getSenhaMestre(Administrador adm) {
		if(temAcessoAdmin()) {
			return senhaMestre;
		}
		return null;
	}

	public void setSenhaMestre(String senhaMestre) {
		this.senhaMestre = senhaMestre;
	}
	
}
