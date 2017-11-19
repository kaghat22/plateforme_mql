package org.mql.plateforme.doa;

import java.util.List;

import org.mql.plateforme.models.Galerie;


public interface GalerieDao {
	public List<Galerie> selectAll();
	public Galerie select(int id);
	public int add(Galerie user);
	public int delete(int id);
	public int modify(Galerie user);
}
