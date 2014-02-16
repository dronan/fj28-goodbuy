package br.com.caelum.goodbuy.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import br.com.caelum.goodbuy.infra.CriadorDeSession;
import br.com.caelum.goodbuy.modelo.Produto;

public class ProdutoDao {

	private final Session session;
	
	public ProdutoDao() {
		this.session = CriadorDeSession.getSession();
	}
	
	public void salva(Produto produto) {
		Transaction tx = session.beginTransaction();
		session.save(produto);
		tx.commit();
	}

	public void altera(Produto produto) {
		Transaction tx = session.beginTransaction();
		produto.setPreco(500.0);
		session.update(produto);
		tx.commit();
	}

	public  void remove(Produto produto) {
		Transaction tx = session.beginTransaction();
		session.delete(produto);
		tx.commit();
	}

}
