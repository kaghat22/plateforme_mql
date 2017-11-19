package org.mql.plateforme.doa;

import java.util.List;

import org.mql.plateforme.models.Evenement;

public interface EvenementDao {
	public List<Evenement> selectAll();
	public Evenement select(int id);
	public int add(Evenement user);
	public int delete(int id);
	public int modify(Evenement user);
}
