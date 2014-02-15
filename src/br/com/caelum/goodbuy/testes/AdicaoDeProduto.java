package br.com.caelum.goodbuy.testes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import br.com.caelum.goodbuy.modelo.Produto;

@SuppressWarnings("deprecation")
public class AdicaoDeProduto {
	public static void main(String[] args) {

		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		Produto produto = new Produto();

		produto.setNome("Cadeira");
		produto.setDescricao("Uma cadeira qualquer");
		produto.setPreco(5.0);

		Transaction tx = session.beginTransaction();
		session.save(produto);
		tx.commit();

	}
}
