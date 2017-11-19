package org.mql.plateforme.doa;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mql.plateforme.models.Evenement;
import org.mql.plateforme.models.Galerie;

public class GalerieHibernateDao implements GalerieDao {
	private SessionFactory factory;

	private Session session;
	public GalerieHibernateDao() {
	}
	public GalerieHibernateDao(SessionFactory factory) {
		this.factory = factory;
	}

	public void openSession() {
		session = factory.openSession();
		session.beginTransaction();
	}

	public void closeSession() {
		session.getTransaction().commit();
		session.close();
	}
	
	@Override
	public List<Galerie> selectAll() {

		try {
			List<Galerie> list = new ArrayList<>();
			String query = "select * from Galerie";
			openSession();
			SQLQuery sql = session.createSQLQuery(query);
			sql.addEntity(Galerie.class);
			list = sql.list();
			closeSession();
			return list;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Galerie select(int id) {
		openSession();
		Galerie gal = (Galerie) session.get(Galerie.class, id);
		closeSession();
		return gal;
	}

	@Override
	public int add(Galerie user) {
		try {
			openSession();
			session.save(user);
			closeSession();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int delete(int id) {
		try {
			openSession();
			Galerie gal = new Galerie();
			gal.setId(id);
			session.delete(gal);
			closeSession();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int modify(Galerie user) {
		try {
			openSession();
			session.update(user);
			closeSession();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	

}
