package model;

import java.time.LocalDate;

public class Pagamento {
	//**----------------VARIÀVEIS-------------------**//
	private LocalDate data;
	private double valor;
	private String metodo; //"PIX", "Cartão", "Boleto"
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getMetodo() {
		return metodo;
	}
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	
	//**--------------CONSTRUTOR----------------------**//
	
	
}