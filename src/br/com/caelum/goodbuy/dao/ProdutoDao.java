package br.com.caelum.goodbuy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.goodbuy.modelo.Produto;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class ProdutoDao {

	private final Session session;

	public ProdutoDao(Session session) {
		this.session = session;
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

	public void remove(Produto produto) {
		Transaction tx = session.beginTransaction();
		session.delete(produto);
		tx.commit();
	}

	public List<Produto> listaTudo() {
		return this.session.createCriteria(Produto.class).list();
	}

	public Produto carrega(Long id) {
		return (Produto) this.session.load(Produto.class, id);
	}

	public void atualiza(Produto produto) {
		Transaction tx = session.beginTransaction();
		this.session.update(produto);
		tx.commit();
	}
}
