package org.mql.plateforme.models;

public class Utilisateur {
	private int id;
	private String login;
	private String password;
	
	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}
	

	public Utilisateur(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}


	public Utilisateur(int id, String login, String password) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
