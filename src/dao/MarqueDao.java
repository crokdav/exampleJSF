package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Marque;

public class MarqueDao implements IMarqueDao {
	private SessionFactory factory = ConnexionDB.getInstance().getFactory();
	@Override
	public int saveMarque(Marque m) {
		// TODO Auto-generated method stub
		try {
		Session session = factory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(m);
		session.getTransaction().commit();
		return 1;
		
	} catch (HibernateException e) {
		e.printStackTrace();
		System.out.println("erreur");
		return 0;
	}

	
}
	public List<Marque> getMarques() {
		List<Marque> form= new ArrayList<Marque>();
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			form=session.createQuery("from Marque").list();
			session.close();
			return form;
			}
			catch (HibernateException e)
			{
				e.printStackTrace();
				return null;
			}
	}
	
	
	

}
