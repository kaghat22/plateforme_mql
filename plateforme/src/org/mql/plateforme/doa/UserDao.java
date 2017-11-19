package org.mql.plateforme.doa;

import java.util.List;

import org.mql.plateforme.models.Utilisateur;

public interface UserDao {
	public List<Utilisateur> selectAll();
	public Utilisateur select(int id);
	public int add(Utilisateur user);
	public int delete(int id);
	public int modify(Utilisateur user);
}
