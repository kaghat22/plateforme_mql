package org.mql.plateforme.business;

import java.util.List;
import java.util.Vector;

import org.mql.plateforme.doa.EvenementDao;
import org.mql.plateforme.models.Evenement;

public class EvenementDefaultService  implements EvenementService{
	 private EvenementDao daoEve;
	 
	 
 public EvenementDefaultService() {
		super();
		System.out.println("instanciation service evenement");
		// TODO Auto-generated constructor stub
	}

	// les setter et les getter pour l'injection 
 	public EvenementDao getDaoEve() {
		return daoEve;
	}

	public void setDaoEve(EvenementDao daoEve) {
		this.daoEve = daoEve;
	}
	// l'implementtaion des  services
	@Override
	public List<Evenement> selectALL() {
		 System.out.println("la methode  selectAll() ");
		return  daoEve.selectAll();
	}

	

	@Override
	public Evenement select(int id) {
		 System.out.println("la methode select d'un evenement par un id");
		return daoEve.select(id);
	}

	@Override
	public int add(Evenement e) {
		 System.out.println("l'evenement a ajouter "+e);
		 int a=daoEve.add(e);
		
		 System.out.println(a);
		return a;
	}

	@Override
	public int delete(int id) {
		 System.out.println("la methode de suppression  par id");
		return daoEve.delete(id);
	}

	@Override
	public int update(Evenement e) {
		System.out.println("la methode de modification d'un evenement ");
		return daoEve.modify(e);
	}
	public void msgV(){
		System.out.println("bien fait!!!!!");
	}

	@Override
	public List<Evenement> selectByDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Evenement> select(String tag) {
		List<Evenement> events = daoEve.selectAll();
		List<Evenement> evenements = new Vector<>();
		for (Evenement evenement : events) {
			if(evenement.getTags().toLowerCase().contains(tag.toLowerCase())){
				evenements.add(evenement);
			}
		}
		return evenements;
	}

}
