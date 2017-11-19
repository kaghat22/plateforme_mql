package org.mql.plateforme.doa;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mql.plateforme.models.Utilisateur;

public class UserHibernateDao implements UserDao {
	private SessionFactory factory;

	private Session session;
	
	public UserHibernateDao() {
	}

	public UserHibernateDao(SessionFactory factory) {
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
	public List<Utilisateur> selectAll() {
		
		try {
			List<Utilisateur> list = new ArrayList<>();
			String query = "select * from User";
			openSession();
			SQLQuery sql = session.createSQLQuery(query);
			sql.addEntity(Utilisateur.class);
			list = sql.list();
			closeSession();
			return list;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Utilisateur select(int id) {
		openSession();
		Utilisateur user = (Utilisateur) session.get(Utilisateur.class, id);
		closeSession();
		return user;
	}

	@Override
	public int add(Utilisateur user) {
		try {
			openSession();
			session.save(user);
			//session.saveOrUpdate(user);
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
			Utilisateur u = new Utilisateur();
			u.setId(id);
			session.delete(u);
			closeSession();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int modify(Utilisateur user) {
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
