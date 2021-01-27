package dao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import domain.Produto;


public class ProdutoDAOTest {
	
	private ProdutoDAO produtoDAO;
	
	@Before
	public void iniciar() {
		produtoDAO = new ProdutoDAO();
	}
	
	
	public void salvar() {
		Produto p1 = new Produto();
		p1.setDataDeValidade(LocalDate.of(2021, 01, 15));
		p1.setNome("Notebook");
		p1.setPreco(BigDecimal.valueOf(1250.60));
		p1.setQuantidade(15);
		
		Produto p2 = new Produto(
				null, 
				"Desktop", 
				15, 
				BigDecimal.valueOf(2500.00), 
				LocalDate.of(2021, 01, 20),
				null);
		
		produtoDAO.salvar(p1);
		produtoDAO.salvar(p2);
	}
	
	
	public void buscar() {
		Produto p1 = produtoDAO.buscar(1);
		System.out.println(p1);
		Produto p2 = produtoDAO.buscar(2);
		System.out.println(p2);
	}
	
	
	public void listar() {
		List<Produto> produtos = produtoDAO.listar();
		
		for(Produto produto : produtos) {
			System.out.println(produto);
		}
	}
	
	@Test
	public void testar() {
		salvar();
		buscar();
		listar();
	}
	
}
