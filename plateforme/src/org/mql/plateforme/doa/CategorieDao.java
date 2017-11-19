package org.mql.plateforme.doa;

import java.util.List;

import org.mql.plateforme.models.Categorie;
import org.mql.plateforme.models.Evenement;

public interface CategorieDao {
	public List<Categorie> selectAll();
	public Categorie select(int id);
	public int add(Categorie cat);
	public int delete(int id);
	public int modify(Categorie cat);
}
