package org.mql.plateforme.business;

import java.util.List;

import org.mql.plateforme.doa.UserDao;
import org.mql.plateforme.models.Utilisateur;

public class UserDefaultService  implements UserService{
	private UserDao daoUs;
	

	public UserDefaultService() {
		// TODO Auto-generated constructor stub
	}
	

	public UserDao getDaoUs() {
		return daoUs;
	}


	public void setDaoUs(UserDao daoUs) {
		this.daoUs = daoUs;
	}


	@Override
	public List<Utilisateur> selectAll() {
		// TODO Auto-generated method stub
		return daoUs.selectAll();
	}

	@Override
	public Utilisateur select(int id) {
		// TODO Auto-generated method stub
		return daoUs.select(id);
	}

	@Override
	public int add(Utilisateur user) {
		// TODO Auto-generated method stub
		return daoUs.add(user);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return daoUs.delete(id);
	}

	@Override
	public int modify(Utilisateur user) {
		// TODO Auto-generated method stub
		return daoUs.modify(user);
	}

}
