package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Marque;
import model.Produit;


public class ProduitDao implements IProduitDao {
	private SessionFactory factory = ConnexionDB.getInstance().getFactory();
	@Override
	public int saveProduct(Produit p) {
		try {
			
		Session session = factory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(p);
		session.getTransaction().commit();
		return 1;
		
	} catch (HibernateException e) {
		e.printStackTrace();
		System.out.println("erreur");
		return 0;
	}

	
	
}
	public List<Produit> getProduits() {
		List<Produit> form= new ArrayList<Produit>();
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			form=session.createQuery("from Produit").list();
			session.close();
			return form;
			}
			catch (HibernateException e)
			{
				e.printStackTrace();
				return null;
			}
	}
	@Override
	public List<Produit> getProducts(Marque marque) {
		List<Produit> form= new ArrayList<Produit>();
		try {
			SessionFactory factory = ConnexionDB.getInstance().getFactory();
			Session session = ConnexionDB.getInstance().getSession();
			session.beginTransaction();
			Query query = session.createQuery("from Produit where Marque.idMarque= :idMarque");
			query.setParameter("marque", marque.getIdMarque());
			form=query.list();
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
