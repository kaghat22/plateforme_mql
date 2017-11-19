package org.mql.plateforme.models;

public class Categorie {
	 private int idCat;
	  private String label;

	public Categorie() {
		// TODO Auto-generated constructor stub
	}
	

	public Categorie(int idCat, String label) {
		super();
		this.idCat = idCat;
		this.label = label;
	}


	public int getIdCat() {
		return idCat;
	}


	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	

}
