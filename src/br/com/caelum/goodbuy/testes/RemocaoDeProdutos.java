package br.com.caelum.goodbuy.testes;

import org.hibernate.Session;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.infra.CriadorDeSession;
import br.com.caelum.goodbuy.modelo.Produto;

public class RemocaoDeProdutos {
	public static void main(String[] args) {
		
		Session session = CriadorDeSession.getSession();
		
		Produto produto = removeProduto(session);
		
		new ProdutoDao().remove(produto);
		
	}

	private static Produto removeProduto(Session session) {
		Produto produto = (Produto) session.load(Produto.class, 2L);
		return produto;
	}
}
