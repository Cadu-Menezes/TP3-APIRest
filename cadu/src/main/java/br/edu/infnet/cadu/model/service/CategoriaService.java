package br.edu.infnet.cadu.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.cadu.model.domain.Categoria;

@Service
public class CategoriaService {
	
	private static Map<Integer, Categoria> categorias = new HashMap<Integer, Categoria>();
	
	public void incluir(Categoria categoria) {
		categorias.put(categoria.getId(), categoria);
	}
	
	public void excluir(int id) {
		categorias.remove(id);
	
	}
	
	public Collection<Categoria> obterLista(){
		return categorias.values();
	}
	
	public Categoria Obter(int id) {
		return categorias.get(id);
	}
	
}
