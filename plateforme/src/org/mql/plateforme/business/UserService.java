package org.mql.plateforme.business;

import java.util.List;

import org.mql.plateforme.models.Utilisateur;

public interface UserService {
	public List<Utilisateur> selectAll();
	public Utilisateur select(int id);
	public int add(Utilisateur user);
	public int delete(int id);
	public int modify(Utilisateur user);

}
