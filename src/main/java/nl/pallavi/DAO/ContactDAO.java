package nl.pallavi.DAO;

import java.util.List;

import nl.pallavi.Model.Contact;

public interface ContactDAO {

	public void save(Contact c);

	public List<Contact> list();
}
