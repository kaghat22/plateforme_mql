package org.mql.plateforme.models;

import java.util.Date;
import java.util.List;

public class Galerie extends Article {
	
	private String documents;
	private  String images;
	private  String videos;
	private boolean valide;
	public Galerie(String documents, String images, String videos) {
		super();
		this.documents = documents;
		this.images = images;
		this.videos = videos;
	}
	public Galerie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Galerie(String documents, String images, String videos, boolean valide) {
		super();
		this.documents = documents;
		this.images = images;
		this.videos = videos;
		this.valide = valide;
	}
	public boolean isValide() {
		return valide;
	}
	public void setValide(boolean valide) {
		this.valide = valide;
	}
	public Galerie(int id, String titre, String description, String imgPath, String lieu, Date datePub, Date dateModif,
			String tags) {
		super(id, titre, description, imgPath, lieu, datePub, dateModif, tags);
		// TODO Auto-generated constructor stub
	}
	public Galerie(int id, String titre, String description, String imgPath, String lieu, Date datePub, Date dateModif,
			String tags,String documents,String images,String videos) {
		super(id, titre, description, imgPath, lieu, datePub, dateModif, tags);
		this.images = images;
		this.documents = documents;
		this.videos = videos;
		// TODO Auto-generated constructor stub
	}
	public String getDocuments() {
		return documents;
	}
	public void setDocuments(String documents) {
		this.documents = documents;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getVideos() {
		return videos;
	}
	public void setVideos(String videos) {
		this.videos = videos;
	}
	
	

	
}
