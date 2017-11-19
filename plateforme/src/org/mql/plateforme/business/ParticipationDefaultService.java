package org.mql.plateforme.business;

import java.util.List;

import org.mql.plateforme.doa.ParticipationDao;
import org.mql.plateforme.models.Evenement;
import org.mql.plateforme.models.Participation;
import org.mql.plateforme.models.Utilisateur;

public class ParticipationDefaultService implements ParticipationService {
	 private ParticipationDao daoPa;
	 
	 

	public ParticipationDefaultService() {
		super();
		// TODO Auto-generated constructor stub
	}
	// getter and setter
	public ParticipationDao getDaoPa() {
		return daoPa;
	}
	public void setDaoPa(ParticipationDao daoPa) {
		this.daoPa = daoPa;
	}
	// l'implementation des methodes

	@Override
	public List<Participation> selectAll() {
		 return daoPa.selectAll();
	}
	@Override
	public List<Evenement> selectByUser(int idUser) {
		 return daoPa.selectByUser(idUser);
	}

	@Override
	public List<Utilisateur> selectByEve(int idEvent) {
		 return daoPa.selectByEve(idEvent);
	}

	@Override
	public int add(Participation participation) {
		return  daoPa.add(participation);
	}

	@Override
	public int delete(int idP) {
		 return daoPa.delete(idP);
	}

}
