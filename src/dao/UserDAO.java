package dao;





import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import model.Login;


public class UserDAO implements IUserDAO{
	private SessionFactory factory = ConnexionDB.getInstance().getFactory();
	Session session = factory.openSession();
	@Override
	public int saveUser(Login u) {
		try {
			session.beginTransaction();
			session.saveOrUpdate(u);
			session.getTransaction().commit();
			return 1;
			
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("erreur");
			return 0;
		}
		
	}
	
	
	

	
			@Override
			public int verifUser(Login login) {
				try {
				session.beginTransaction();
				String request="from Login where username= :userU and password= :passwordU";
				Query query = session.createQuery(request);
				query.setParameter("userU", login.getUsername());
	            query.setParameter("passwordU", login.getPassword());
				
				if ((Login) query.uniqueResult()!=null) {
				return 1;
				}
				else {
					return 0;
				}
				}
				catch (HibernateException e)
				{
					e.printStackTrace();
					return 0;
				}
				
				
			}
	}
	
	

