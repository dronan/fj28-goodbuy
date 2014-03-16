package br.com.caelum.goodbuy.testes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.infra.CriadorDeSession;
import br.com.caelum.goodbuy.infra.CriadorDeSessionFactory;
import br.com.caelum.goodbuy.modelo.Produto;

public class AlteracaoDeProduto {

	public static void main(String[] args) {

		SessionFactory factory = new CriadorDeSessionFactory().getInstance();
		Session session = new CriadorDeSession(factory).getInstance();
		ProdutoDao dao = new ProdutoDao(session);
		
		Produto produto = alteraProduto(session);
		
		dao.altera(produto);
		
	}

	private static Produto alteraProduto(Session session) {
		Produto produto = (Produto) session.load(Produto.class, 1L);
		return produto;
	}

}
