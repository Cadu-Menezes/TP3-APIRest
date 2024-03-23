package br.edu.infnet.cadu.model.domain;

import java.util.List;

public class Categoria {
	
	private int id;
	private String descricao;
	private boolean fixo;
	private List<Movimentacao> movimentacao;
	
	
	public Categoria() {
		
	}
	
	public Categoria(String descricao) {
		this.setDescricao(descricao);
	}
	
	public Categoria(int id, String descricao, boolean fixo) {
		this.setId(id);
		this.setDescricao(descricao);
		this.setFixo(fixo);
	}
	
	@Override
	public String toString() {
		return id +" - "+ descricao + " - "+ fixo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<Movimentacao> getMovimentacao() {
		return movimentacao;
	}
	
	public void setMovimentacao(List<Movimentacao> movimentacao) {
		this.movimentacao = movimentacao;
	}

	public boolean isFixo() {
		return fixo;
	}

	public void setFixo(boolean fixo) {
		this.fixo = fixo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
