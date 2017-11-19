package org.mql.plateforme.doa;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mql.plateforme.models.Evenement;
import org.mql.plateforme.models.Utilisateur;

public class EvenementHibernateDao implements EvenementDao{

	private SessionFactory factory;

	private Session session;
	public EvenementHibernateDao() {
	}
	
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public EvenementHibernateDao(SessionFactory factory) {
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
	public List<Evenement> selectAll() {

		try {
			List<Evenement> list = new ArrayList<>();
			String query = "select * from Evenement";
			openSession();
			SQLQuery sql = session.createSQLQuery(query);
			sql.addEntity(Evenement.class);
			list = sql.list();
			closeSession();
			return list;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Evenement select(int id) {
		openSession();
		Evenement event = (Evenement) session.get(Evenement.class, id);
		closeSession();
		return event;
	}

	@Override
	public int add(Evenement event) {
		System.out.println("dao " +event);
		try {
			System.out.println(1);
			openSession();
			//System.out.println(2);
			session.save(event);
			System.out.println(3);
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
			Evenement event = new Evenement();
			event.setId(id);
			session.delete(event);
			closeSession();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	@Override
	public int modify(Evenement event) {
		try {
			openSession();
			session.update(event);
			closeSession();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	public void msg(){
		System.out.println("gooooooooooo");
	}

}
