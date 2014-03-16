package br.com.caelum.goodbuy.infra;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
public class CriadorDeSessionFactory implements
		ComponentFactory<SessionFactory> {

	public SessionFactory getInstance() {
		Configuration configuration = new Configuration()
				.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		return factory;
	}

}
