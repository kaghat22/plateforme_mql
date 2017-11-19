package org.mql.plateforme.business;

import java.util.List;

import org.mql.plateforme.models.Galerie;

public interface GalerieService {
	 public List<Galerie> sellectAll();
	 public Galerie select(int id);
	 public int add(Galerie g);
	 public int delete(int id);
	 public int update(Galerie g);

}
