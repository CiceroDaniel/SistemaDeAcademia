package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario{
	public Aluno(String nome, String cpf, String email, String telefone) {
		super(nome, cpf, email, telefone);
		
	}
	//**----------------VARIÀVEIS-------------------**//
	private double altura;
	private double peso;
	private String objetivo;
	private Plano plano;
	private List<Avaliacaofisica> avaliacao = new ArrayList<>();
	private List<Pagamento> pagamentos = new ArrayList<>();
	@Override
	public String gerarCredenciais() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean temAcessoAdmin() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	//**--------------CONSTRUTOR----------------------**//
	
	
}