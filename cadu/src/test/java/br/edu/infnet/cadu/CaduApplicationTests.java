package br.edu.infnet.cadu;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.cadu.model.domain.Movimentacao;


@SpringBootTest
class CaduApplicationTests {

	private Movimentacao mov;
	
	@Test
	void contextLoads() {
	}
	
	@BeforeEach
	void setUp() {
		
		mov = new Movimentacao();
		mov.setId(1);
		mov.setEntrada(true);
		mov.setFixa(false);
		mov.setValor(250);
		mov.setSaldo(1000);
		
	}
	
	
	@Test
	void verificarEntrada() {
		
		mov.setEntrada(true);
		mov.setValor(250);
		assertEquals(250,  mov.verificarEntradaSaida());
	
	}

	@Test
	void verificarSaida() {

		mov.setEntrada(false);
		mov.setValor(250);
		assertEquals(-250,  mov.verificarEntradaSaida());
		
	}
	
	@Test
	void verificarDados() {
				
		assertEquals(1,  mov.getId());
		assertEquals(true,  mov.isEntrada());
		assertEquals(false,  mov.isFixa());
		assertEquals(250,  mov.getValor());
		assertEquals(1000,  mov.getSaldo());
		
	}
		
}

