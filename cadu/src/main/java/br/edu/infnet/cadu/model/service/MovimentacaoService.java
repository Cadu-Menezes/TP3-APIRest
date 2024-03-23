package br.edu.infnet.cadu.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import br.edu.infnet.cadu.model.domain.Movimentacao;

@Service
public class MovimentacaoService {
	
	private static Map<Integer, Movimentacao> movimentacoes = new HashMap<Integer, Movimentacao>();
	
	public void incluir(Movimentacao movimentacao) {
		movimentacoes.put(movimentacao.getId(), movimentacao);
	}
	
	public void excluir(int id) {
		movimentacoes.remove(id);
	
	}
	
	public Collection<Movimentacao> obterLista(){
		return movimentacoes.values();
	}
	
	public Movimentacao Obter(int id) {
		return movimentacoes.get(id);
	}
	
}
