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

import br.edu.infnet.cadu.model.domain.Movimentacao;
import br.edu.infnet.cadu.model.service.MovimentacaoService;

@RestController
@RequestMapping("/api/movimentacao")
public class CategoriaController {
	
	@Autowired
	private MovimentacaoService movimentacaoService;
	
	@PostMapping(value = "/cadastrar")
	public void incluir(@RequestBody Movimentacao movimentacao) {
		movimentacaoService.incluir(movimentacao);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable int id) {
		movimentacaoService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Movimentacao> obterLista(){
		return movimentacaoService.obterLista();
	}
	
	@GetMapping(value = "/{id}/pesquisar")
	public Movimentacao Obter(@PathVariable int id) {
		return movimentacaoService.Obter(id);
	}
	
	
}
