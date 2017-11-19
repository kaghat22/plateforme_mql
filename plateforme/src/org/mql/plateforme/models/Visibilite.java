package org.mql.plateforme.models;

public class Visibilite {
	 private int  idVisibilite;
	 private String label;

	public Visibilite() {
		// TODO Auto-generated constructor stub
	}

	public Visibilite(int idVisibilite, String label) {
		super();
		this.idVisibilite = idVisibilite;
		this.label = label;
	}

	public int getIdVisibilite() {
		return idVisibilite;
	}

	public void setIdVisibilite(int idVisibilite) {
		this.idVisibilite = idVisibilite;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	

}
