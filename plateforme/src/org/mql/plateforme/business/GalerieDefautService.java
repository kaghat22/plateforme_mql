package org.mql.plateforme.business;

import java.util.List;

import org.mql.plateforme.doa.GalerieDao;
import org.mql.plateforme.models.Galerie;

public class GalerieDefautService implements GalerieService{
	private GalerieDao daoGa;
	
	
	public GalerieDefautService() {
		super();
		// TODO Auto-generated constructor stub
	}

	// les getter and setter
	public GalerieDao getDaoGa() {
		return daoGa;
	}

	public void setDaoGa(GalerieDao daoGa) {
		this.daoGa = daoGa;
	}

	// l'implementation des methodes
	@Override
	public List<Galerie> sellectAll() {
		return daoGa.selectAll();
	}

	@Override
	public Galerie select(int id) {
		return daoGa.select(id);
	}

	@Override
	public int add(Galerie g) {
		return daoGa.add(g);
	}

	@Override
	public int delete(int id) {
		return daoGa.delete(id);
	}

	@Override
	public int update(Galerie g) {
		 return daoGa.modify(g);
	}

}
