package org.mql.plateforme.models;

import java.util.Date;
import java.util.List;

public class Evenement extends Article {
	private Date dateEvent;
	private Categorie cat;
	private Visibilite visib;
	
	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Evenement(int id, String titre, String description, String imgPath, String lieu, Date datePub,
			Date dateModif, String tags, String piece) {
		super(id, titre, description, imgPath, lieu, datePub, dateModif, tags, piece);
		// TODO Auto-generated constructor stub
	}

	public Evenement(int id, String titre, String description, String imgPath, String lieu, Date datePub,
			Date dateModif, String tags,Date dateEvent, Categorie cat, Visibilite visib) {
		super(id, titre, description, imgPath, lieu, datePub, dateModif, tags);

		this.dateEvent = dateEvent;
		this.cat = cat;
		this.visib = visib;
		// TODO Auto-generated constructor stub
	}


	public Evenement(int id, String titre, String description, String imgPath, String lieu, Date datePub,
			Date dateModif, String tags) {
		super(id, titre, description, imgPath, lieu, datePub, dateModif, tags);
		// TODO Auto-generated constructor stub
	}




	public Evenement(String titre, String description, String imgPath, String lieu, Date datePub, Date dateModif,
			String tags) {
		super(titre, description, imgPath, lieu, datePub, dateModif, tags);
		// TODO Auto-generated constructor stub
	}

	public Evenement(Date dateEvent, Categorie cat, Visibilite visib) {
		super();
		this.dateEvent = dateEvent;
		this.cat = cat;
		this.visib = visib;
	}

	public Evenement(Date dateEvent) {
		super();
		this.dateEvent = dateEvent;
	}
	public Date getDateEvent() {
		return dateEvent;
	}
	public void setDateEvent(Date dateEvent) {
		this.dateEvent = dateEvent;
	}

	public Categorie getCat() {
		return cat;
	}

	public void setCat(Categorie cat) {
		this.cat = cat;
	}

	public Visibilite getVisib() {
		return visib;
	}

	public void setVisib(Visibilite visib) {
		this.visib = visib;
	}

	public int getIdVisibilite() {
		return visib.getIdVisibilite();
	}

	public void setIdVisibilite(int idVisibilite) {
		visib.setIdVisibilite(idVisibilite);
	}

	public int getIdCat() {
		return cat.getIdCat();
	}

	public void setIdCat(int idCat) {
		cat.setIdCat(idCat);
	}

	public String getLabel() {
		return cat.getLabel();
	}

	public void setLabel(String label) {
		cat.setLabel(label);
	}
	
	
	
	
	
	//peut etre faire un Enum , peut etre une session d'ambauche , une presentation , un test psychotec ...

	
	
}
