package org.mql.plateforme.doa;

import java.util.List;

import org.mql.plateforme.models.Categorie;
import org.mql.plateforme.models.Visibilite;

public interface VisibiliteDao {

	public List<Visibilite> selectAll();
	public Visibilite select(int id);
	public int add(Visibilite cat);
	public int delete(int id);
	public int modify(Visibilite cat);
}
