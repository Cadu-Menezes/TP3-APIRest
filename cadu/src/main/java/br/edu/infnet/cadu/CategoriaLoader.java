package br.edu.infnet.cadu;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.cadu.model.domain.Categoria;
import br.edu.infnet.cadu.model.service.CategoriaService;

@Component
public class CategoriaLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		
		  CategoriaService categoriaService = new CategoriaService();
		  
		  System.out.println("Start - " + categoriaService.obterLista());
		  
		  categoriaService.incluir(new Categoria(1, "Lazer", false));
		    
		  System.out.println("Listar todos - " + categoriaService.obterLista());
		  
		  categoriaService.excluir(1);
		  
		  System.out.println("Listar todos - " + categoriaService.obterLista());
		  
		  categoriaService.incluir(new Categoria(1, "Salario", true));
		  categoriaService.incluir(new Categoria(2, "Investimentos", false));
		  
		  System.out.println("Lista Todos - " + categoriaService.obterLista());
	
		  System.out.println("Categoria 1 - " + categoriaService.Obter(1));
		 
	}

}
