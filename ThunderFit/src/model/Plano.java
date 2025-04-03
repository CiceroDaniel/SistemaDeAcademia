package model;

public class Plano {
	//**----------------VARIÀVEIS-------------------**//
	private String nome;
	private double valorMensal;
	private int quantidadeDeDias;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nomePlano) {
		if(nomePlano != null && !nomePlano.isBlank()) {
			this.nome = nomePlano;
		}
	}
	
	public double getValorMensal() {
		return valorMensal;
	}
	
	public void setValorMensal(double valor) {
		if(valor > 0) {
			this.valorMensal = valor;
		}else {
			System.out.println("VALOR INVALIDO");
		}
	}
	
	public int getQuantidadeDeDias() {
		return quantidadeDeDias;	
	}
	
	public void setQuantidadeDeDias(int quantDias) {
		if(quantDias > 0) {
			this.quantidadeDeDias = quantDias;
		}else { 
			System.out.println("ADICIONE UMA QUANTIDADE VALIDA DE DIAS");
		}
	}
	
}