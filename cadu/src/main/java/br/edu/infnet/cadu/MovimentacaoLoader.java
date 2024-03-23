package br.edu.infnet.cadu;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.cadu.model.domain.Categoria;
import br.edu.infnet.cadu.model.domain.Movimentacao;
import br.edu.infnet.cadu.model.service.MovimentacaoService;

@Component
public class MovimentacaoLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		
		  MovimentacaoService movimentacaoService = new MovimentacaoService();
		  
		  Categoria categoria = new Categoria(5, "Teste Mov", true);
		  
		  System.out.println("Mov Start - " + movimentacaoService.obterLista());
		  
		  movimentacaoService.incluir(new Movimentacao(1, 200.50, true, false, 1000.00, categoria));
		    
		  System.out.println("Mov Listar todos - " + movimentacaoService.obterLista());
		  
		  movimentacaoService.excluir(1);
		  
		  System.out.println("Mov Listar todos - " + movimentacaoService.obterLista());
		  
		  movimentacaoService.incluir(new Movimentacao(1, 340.50, true, false, 1000.00, categoria));
		  movimentacaoService.incluir(new Movimentacao(2, 560.80, true, false, 4000.00, categoria));
		  
		  System.out.println("Mov Lista Todos - " + movimentacaoService.obterLista());
	
		  System.out.println("Mov 1 - " + movimentacaoService.Obter(1));
		 
	}

}
