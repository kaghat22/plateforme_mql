package org.mql.plateforme.business;

import java.util.List;

import org.mql.plateforme.models.Evenement;

public interface EvenementService {
	public List<Evenement> selectALL();
	public  Evenement  select(int id);
	public int add(Evenement e);
	public int delete(int id);
	public int update(Evenement e);
	public List<Evenement> selectByDate();
	public List<Evenement> select(String tag);
}
