package org.mql.plateforme.web;

import org.mql.plateforme.business.UserDefaultService;
import org.mql.plateforme.business.UserService;
import org.mql.plateforme.doa.EvenementDao;
import org.mql.plateforme.doa.EvenementHibernateDao;
import org.mql.plateforme.doa.GalerieDao;
import org.mql.plateforme.doa.GalerieHibernateDao;
import org.mql.plateforme.doa.ParticipationDao;
import org.mql.plateforme.doa.ParticipationHibernateDao;
import org.mql.plateforme.doa.UserDao;
import org.mql.plateforme.doa.UserHibernateDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMehdi {
	public ApplicationContext ctx = new FileSystemXmlApplicationContext("src\\context.xml");
//	void exp01() {
//		UserDao dao = new UserHibernateDao(HibernateUtil.getSessionFactory());
//		Utilisateur user =new Utilisateur(2, "groupC", "groupC");
//		dao.add(user);
//	}
//	void exp11() {
//		CategorieDao dao = new CategorieHibernateDao(HibernateUtil.getSessionFactory());
//		dao.add(new Categorie(1, "Presentation"));
//	}
//	void exp12() {
//		VisibiliteDao dao = new VisibiliteHibernateDao(HibernateUtil.getSessionFactory());
//		dao.add(new Visibilite(1, "mqliste"));
//	}
//	
//	void exp02() {
//		EvenementDao dao = new EvenementHibernateDao(HibernateUtil.getSessionFactory());
//		//Evenement event = new Evenement(1, "Visite CGI", "Lundi 01/11/2017 cgi effectuera une visite au master qualité logiciel .....", "D:/", "Salle Conf", new Date("20/10/2017"), new Date("22/10/2017"), "Evenement;CGI;MQL",new Date("01/11/2017"),"Presentation");
//		Evenement ev = new Evenement(1, "Visite CGI", "Lundi 01/11/2017 cgi effectuera une visite au master qualité logiciel .....", "D:/", "Salle Conf", new Date("20/10/2017"), new Date("22/10/2017"), "Evenement;CGI;MQL",new Date("01/11/2017"),new Categorie(1, "Presentation"), new Visibilite(1, "Mqliste"));
//		
//		
//		dao.add(ev);
//	
//	}
//	void exp03() {
//		GalerieDao dao = new GalerieHibernateDao(HibernateUtil.getSessionFactory());
//		Galerie gal = new Galerie(1, "Visite CGI", "", "", "FES", new Date(), new Date(), "", "", "", "");
//		dao.add(gal);
//	
//	
//	}
//	void exp04() {
//		ParticipationDao dao = new ParticipationHibernateDao(HibernateUtil.getSessionFactory());
//		Evenement event = new Evenement(2, "Visite CGI", "Lundi 01/11/2017 cgi effectuera une visite au master qualité logiciel .....", "D:/", "Salle Conf", new Date("20/10/2017"), new Date("22/10/2017"), "Evenement;CGI;MQL",new Date("01/11/2017"),new Categorie(1, "Presentation"), new Visibilite(1, "Mqliste"));
//		
//		Utilisateur user =new Utilisateur(2, "groupC", "groupC");
//		Participation par = new Participation(event, user);
//		
//		dao.add(par);
//		//Evenement ev = dao.selectByUser(2).get(0);
//		//System.out.println(ev.getId());
//
//	}
	// Test injection de la session + Test SPRING
	void exp05() {
		
		//UserDao dao =  ctx. getBean("daoUser",UserHibernateDao.class);
		UserService service = ctx.getBean("serviceUser",UserDefaultService.class);
		System.out.println(service.selectAll().size());
	}
	void exp06() {
		EvenementDao dao =  ctx. getBean("daoEvenement",EvenementHibernateDao.class);
		System.out.println(dao.selectAll().size());
	}
	void exp07() {
		GalerieDao dao =  ctx. getBean("daoGalerie",GalerieHibernateDao.class);
		System.out.println(dao.selectAll().size());
	}
	void exp08() {
		ParticipationDao dao =  ctx. getBean("daoParticipation",ParticipationHibernateDao.class);
		System.out.println(dao.selectAll().size());
	}
	public TestMehdi() {
		exp05();
	}

	public static void main(String[] args) {
		new TestMehdi();

	}

}
