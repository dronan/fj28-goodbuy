package br.com.caelum.goodbuy.testes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.infra.CriadorDeSession;
import br.com.caelum.goodbuy.infra.CriadorDeSessionFactory;
import br.com.caelum.goodbuy.modelo.Produto;

public class AdicaoDeProduto {
	public static void main(String[] args) {

		SessionFactory factory = new CriadorDeSessionFactory().getInstance();
		Session session = new CriadorDeSession(factory).getInstance();
		ProdutoDao dao = new ProdutoDao(session);
		
		Produto produto = criaProduto();
				
		dao.salva(produto);

	}

	private static Produto criaProduto() {
		Produto produto = new Produto();

		produto.setNome("Cadeira");
		produto.setDescricao("Uma cadeira qualquer");
		produto.setPreco(5.0);
		return produto;
	}
}
