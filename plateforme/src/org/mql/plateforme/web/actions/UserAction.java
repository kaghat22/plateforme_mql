package org.mql.plateforme.web.actions;

import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.mql.plateforme.business.UserDefaultService;
import org.mql.plateforme.business.UserService;
import org.mql.plateforme.doa.UserDao;
import org.mql.plateforme.doa.UserHibernateDao;
import org.mql.plateforme.models.Utilisateur;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserAction {
	private UserService userService;
	private List<Utilisateur> users;
	private Utilisateur userUpdate;
	public ApplicationContext ctx = new FileSystemXmlApplicationContext("file:C:\\Users\\Mehdi\\Desktop\\plateforme\\src\\context.xml");
	
	public UserAction() {
		System.out.println("Constructor");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("PostConstruct");
		try {

			userService = ctx.getBean("serviceUser",UserDefaultService.class);
			refreshList();
			userUpdate = new Utilisateur();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<Utilisateur> getUsers() {
		return users;
	}



	public void setUsers(List<Utilisateur> users) {
		this.users = users;
	}



	public Utilisateur getUserUpdate() {
		return userUpdate;
	}



	public void setUserUpdate(Utilisateur userUpdate) {
		this.userUpdate = userUpdate;
	}



	public ApplicationContext getCtx() {
		return ctx;
	}

	public void setCtx(ApplicationContext ctx) {
		this.ctx = ctx;
	}

	public void addUser(Utilisateur user) {
		int r = userService.add(user);
		refreshList();
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"info","Utilisateur enregistré"));
		if (r == 1) {
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"info","Utilisateur enregistré"));
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erreur",
					"Une erreur s'est produit lors d'enregistrement."));
		}
	}

	public void removeUser(Utilisateur user) {

		int r = userService.delete(user.getId());
		refreshList();
		if (r == 1) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Utilisateur supprimé avec succès."));
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erreur",
					"Une erreur s'est produit lors de la suppression."));
		}

	}

	public void updateUser(Utilisateur user) {
		int r = userService.modify(user);
		refreshList();
		if (r == 1) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Utilisateur modifié avec succès."));
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erreur",
					"Une erreur s'est produit lors de la modifcation."));
		}
	}

	public void refreshList() {
		users = userService.selectAll();
		Collections.reverse(users);
	}

}
