package org.mql.plateforme.models;

public class Participation {
	private int idParticip;
	private Evenement evenement;
	private Utilisateur user;
	private static int counter = 0;
	
	public Participation() {
		counter++;
	}

	public Participation(int id,Evenement evenement, Utilisateur user) {
		super();
		this.idParticip = id;
		this.evenement = evenement;
		this.user = user;
		counter++;
	}
	
	public Participation(Evenement evenement, Utilisateur user) {
		super();
		this.evenement = evenement;
		this.user = user;
		counter++;
	}

	public int getIdParticip() {
		return idParticip;
	}

	public void setIdParticip(int idParticip) {
		this.idParticip = idParticip;
	}

	public Evenement getEvenement() {
		return evenement;
	}

	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

	public static int getCounter() {
		return counter;
	}


	
	
	
}
