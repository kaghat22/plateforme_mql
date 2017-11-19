package org.mql.plateforme.doa;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mql.plateforme.models.Evenement;
import org.mql.plateforme.models.Participation;
import org.mql.plateforme.models.Utilisateur;

public class ParticipationHibernateDao implements ParticipationDao{
	private SessionFactory factory;

	private Session session;
	public ParticipationHibernateDao() {
	}

	public ParticipationHibernateDao(SessionFactory factory) {
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
	public List<Participation> selectAll() {
		try {
			List<Participation> list = new ArrayList<>();
			String query = "select * from PARTICIPATION";
			openSession();
			SQLQuery sql = session.createSQLQuery(query);
			sql.addEntity(Participation.class);
			list = sql.list();
			closeSession();
			return list;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Evenement> selectByUser(int idUser) {
		List<Participation> pars = this.selectAll();
		List<Integer> ids = new ArrayList<>();
		List<Evenement> list = new ArrayList<>();
		for (Participation participation : pars) {
			if(participation.getUser().getId() == idUser) {
				ids.add(participation.getEvenement().getId());
				}
		}
		for (Integer id : ids) {
			openSession();
			Evenement event = (Evenement) session.get(Evenement.class, id);
			closeSession();
			list.add(event);
		}
		return list;
	}
		


	public List<Utilisateur> selectByEve(int idEvent) {
		List<Participation> pars = this.selectAll();
		List<Integer> ids = new ArrayList<>();
		List<Utilisateur> list = new ArrayList<>();
		for (Participation participation : pars) {
			if(participation.getEvenement().getId() == idEvent) {
				ids.add(participation.getUser().getId());
				}
		}
		for (Integer id : ids) {
			openSession();
			Utilisateur user = (Utilisateur) session.get(Utilisateur.class, id);
			closeSession();
			list.add(user);
		}
		return list;
	}

	@Override
	public int add(Participation participation) {
			try {
				openSession();
				session.save(participation);
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
			Participation par = new Participation();
			par.setIdParticip(id);
			session.delete(par);
			closeSession();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}


}





