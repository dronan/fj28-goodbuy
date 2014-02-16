package br.com.caelum.goodbuy.testes;

import org.hibernate.Session;
import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.infra.CriadorDeSession;
import br.com.caelum.goodbuy.modelo.Produto;

public class AlteracaoDeProduto {

	public static void main(String[] args) {

		Session session = CriadorDeSession.getSession();
		
		Produto produto = alteraProduto(session);
		
		new ProdutoDao().altera(produto);
		
	}

	private static Produto alteraProduto(Session session) {
		Produto produto = (Produto) session.load(Produto.class, 1L);
		return produto;
	}

}
