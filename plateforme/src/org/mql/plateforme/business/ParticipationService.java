package org.mql.plateforme.business;

import java.util.List;

import org.mql.plateforme.models.Evenement;
import org.mql.plateforme.models.Participation;
import org.mql.plateforme.models.Utilisateur;

public interface ParticipationService {
	public List<Participation> selectAll();
	public List<Evenement> selectByUser(int idUser);
	public List<Utilisateur> selectByEve(int idEvent);
	public int add(Participation participation);
	public int delete(int idP);

}
