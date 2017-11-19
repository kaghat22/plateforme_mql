
package org.mql.plateforme.doa;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mql.plateforme.models.Categorie;
import org.mql.plateforme.models.Evenement;
import org.mql.plateforme.models.Utilisateur;
import org.mql.plateforme.models.Visibilite;

public class VisibiliteHibernateDao implements VisibiliteDao{

	private SessionFactory factory;

	private Session session;
	public VisibiliteHibernateDao() {
	}
	
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public VisibiliteHibernateDao(SessionFactory factory) {
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
	public List<Visibilite> selectAll() {

		try {
			List<Visibilite> list = new ArrayList<>();
			String query = "select * from Visibilite";
			openSession();
			SQLQuery sql = session.createSQLQuery(query);
			sql.addEntity(Visibilite.class);
			list = sql.list();
			closeSession();
			return list;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Visibilite select(int id) {
		openSession();
		Visibilite visib = (Visibilite) session.get(Visibilite.class, id);
		closeSession();
		return visib;
	}

	@Override
	public int add(Visibilite visib) {
		try {
			openSession();
			session.save(visib);
			closeSession();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	@Override
	public int delete(int id) {
		try {
			openSession();
			Visibilite visib = new Visibilite();
			visib.setIdVisibilite(id);
			session.delete(visib);
			closeSession();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	@Override
	public int modify(Visibilite cat) {
		try {
			openSession();
			session.update(cat);
			closeSession();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

}
