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

public class CategorieHibernateDao implements CategorieDao{

	private SessionFactory factory;

	private Session session;
	public CategorieHibernateDao() {
	}
	
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public CategorieHibernateDao(SessionFactory factory) {
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
	public List<Categorie> selectAll() {

		try {
			List<Categorie> list = new ArrayList<>();
			String query = "select * from Categorie";
			openSession();
			SQLQuery sql = session.createSQLQuery(query);
			sql.addEntity(Categorie.class);
			list = sql.list();
			closeSession();
			return list;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Categorie select(int id) {
		openSession();
		Categorie cat = (Categorie) session.get(Categorie.class, id);
		closeSession();
		return cat;
	}

	@Override
	public int add(Categorie cat) {
		System.out.println("dao " +cat);
		try {
			openSession();
			session.save(cat);
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
			Categorie cat = new Categorie();
			cat.setIdCat(id);
			session.delete(cat);
			closeSession();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	@Override
	public int modify(Categorie cat) {
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
