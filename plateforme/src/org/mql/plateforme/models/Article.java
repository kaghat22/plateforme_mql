package org.mql.plateforme.models;

import java.util.Date;

import org.hibernate.annotations.Entity;

public class Article {
	// after update
	private int id;
	private String titre;
	private String description;
	private String imgPath;
	private String lieu;
	private Date datePub;
	private Date dateModif;
	private String tags;
	private String piece;
	
	
	public Article() {	
		
	}
	public Article(int id, String titre, String description, String imgPath, String lieu, Date datePub, Date dateModif,
			String tags, String piece) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.imgPath = imgPath;
		this.lieu = lieu;
		this.datePub = datePub;
		this.dateModif = dateModif;
		this.tags = tags;
		this.piece = piece;
	}


	public Article(String titre, String description, String imgPath, String lieu, Date datePub, Date dateModif,
			String tags) {
		super();
		this.titre = titre;
		this.description = description;
		this.imgPath = imgPath;
		this.lieu = lieu;
		this.datePub = datePub;
		this.dateModif = dateModif;
		this.tags = tags;
	}

	public Article(int id, String titre, String description, String imgPath, String lieu, Date datePub, Date dateModif,
			String tags) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.imgPath = imgPath;
		this.lieu = lieu;
		this.datePub = datePub;
		this.dateModif = dateModif;
		this.tags = tags;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public Date getDatePub() {
		return datePub;
	}

	public void setDatePub(Date datePub) {
		this.datePub = datePub;
	}

	public Date getDateModif() {
		return dateModif;
	}

	public void setDateModif(Date dateModif) {
		this.dateModif = dateModif;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", titre=" + titre + ", description=" + description + ", imgPath=" + imgPath
				+ ", lieu=" + lieu + ", datePub=" + datePub + ", dateModif=" + dateModif + ", tags=" + tags + "]";
	}
	
	
	
	
}
