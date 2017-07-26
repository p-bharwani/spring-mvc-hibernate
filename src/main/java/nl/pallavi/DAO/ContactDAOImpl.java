package nl.pallavi.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import nl.pallavi.Model.Contact;

public class ContactDAOImpl implements ContactDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Contact c) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(c);
		tx.commit();
		session.close();
	}

	public List<Contact> list() {

		Session session = this.sessionFactory.openSession();
		List<Contact> contactList = session.createQuery("from Contact").list();
		session.close();
		return contactList;
	}

}
