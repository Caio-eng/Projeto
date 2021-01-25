package dao;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

import domain.Produto;

public class ProdutoDAOTest {
	
	@Test
	public void salvar() {
		Produto p1 = new Produto();
		p1.setId(1);
		p1.setDataDeValidade(LocalDate.of(2021, 01, 15));
		p1.setNome("Notebook");
		p1.setPreco(BigDecimal.valueOf(1250.60));
		p1.setQuantidade(15);
		
		Produto p2 = new Produto(
				2, 
				"Desktop", 
				15, 
				BigDecimal.valueOf(2500.00), 
				LocalDate.of(2021, 01, 20));
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(p1);
		produtoDAO.salvar(p2);
	}
}
