package br.edu.infnet.cadu.model.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.cadu.model.domain.Categoria;
import br.edu.infnet.cadu.model.service.CategoriaService;

@RestController
@RequestMapping("/api/categoria")
public class MovimentacaoController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@PostMapping(value = "/cadastrar")
	public void incluir(@RequestBody Categoria categoria) {
		categoriaService.incluir(categoria);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable int id) {
		categoriaService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Categoria> obterLista(){
		return categoriaService.obterLista();
	}
	
	@GetMapping(value = "/{id}/pesquisar")
	public Categoria Obter(@PathVariable int id) {
		return categoriaService.Obter(id);
	}
	
	
}
