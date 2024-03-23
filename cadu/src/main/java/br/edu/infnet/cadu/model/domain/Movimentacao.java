package br.edu.infnet.cadu.model.domain;

public class Movimentacao {

	private int id;
	private double valor;
	private boolean entrada;
	private boolean fixa;
	private double saldo;
	private Categoria categoria;
	
	public Movimentacao() {
		
	}
	
	public Movimentacao(int id, double valor, boolean entrada, boolean fixa, double saldo) {
		this.setEntrada(entrada);
		this.setFixa(fixa);
		this.setId(id);
		this.setSaldo(saldo);
		this.setValor(valor);
	}
	
	public Movimentacao(int id, double valor, boolean entrada, boolean fixa, double saldo, Categoria categoria) {
		this.setEntrada(entrada);
		this.setFixa(fixa);
		this.setId(id);
		this.setSaldo(saldo);
		this.setValor(valor);
		this.setCategoria(categoria);
	}
	
	@Override
	public String toString() {
		return id +" - "+ valor + " - "+ entrada + " - " + fixa + " - " + saldo + " - " + categoria;
	}
	
	public double verificarEntradaSaida() {
		
		if(entrada) {
			return valor;
		}
		else {
			
	        return valor = valor * -1;
		}
		
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public boolean isEntrada() {
		return entrada;
	}
	
	public void setEntrada(boolean entrada) {
		this.entrada = entrada;
	}
	
	public boolean isFixa() {
		return fixa;
	}
	
	public void setFixa(boolean fixa) {
		this.fixa = fixa;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}
