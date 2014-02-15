package br.com.caelum.goodbuy.testes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.goodbuy.modelo.Produto;

public class RemocaoDeProdutos {
	public static void main(String[] args) {
		
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Produto produto = (Produto) session.load(Produto.class, 2L);
		
		Transaction tx = session.beginTransaction();
		session.delete(produto);
		tx.commit();
		
		
	}
}
