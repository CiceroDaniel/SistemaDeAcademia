package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario{
	
	//**----------------VARIÀVEIS-------------------**//
	private double altura;
	private double peso;
	private String objetivo;
	private Plano plano;
	private List<AvaliacaoFisica> avaliacoes;
	private List<Pagamento> pagamentos;
	
	
	
	//**--------------CONSTRUTOR----------------------**//
	public Aluno(String nome, String cpf, String email, String telefone) {
		super(nome, cpf, email, telefone);
		this.altura = altura;
		this.peso = peso;
		this.objetivo = 
		this.pagamentos = 
	}
	
	
	
	
	
	@Override
	public String gerarCredenciais() {
		// TODO Auto-generated method stub
		return "Nome:" +nome+"\nCPF:" +cpf+"\nEmail:" +email+"\nTelefone:" +telefone;
	}
	@Override
	public boolean temAcessoAdmin() {
		// TODO Auto-generated method stub ggas
		return false;
	}
}