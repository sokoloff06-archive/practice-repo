import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.util.List;

class AddressBook implements Serializable {

	private SessionFactory factory = new Configuration().configure().buildSessionFactory();

	AddressBook() {
	}

	int addContactDB(String firstName, String lastName, String phoneNum) {
		if (booleanSearch(firstName, lastName, phoneNum).iterator().hasNext()) {
			return 0;
		} else {
			return insert(firstName, lastName, phoneNum);
		}
	}

	boolean delete(Person p) {
		int id = p.getId();
		String hql = "delete from Person P where P.id = :id";

		Session session = factory.openSession();
		Query query = session.createQuery(hql);
		query.setParameter("id", id);

		Transaction tx = session.beginTransaction();
		boolean res = query.executeUpdate() != 0;
		tx.commit();

		session.close();
		return res;
	}

	List<Person> search(String filter) {
		filter = "%" + filter + "%";
		String hql = "from Person P where P.firstName like :filter OR P.lastName like :filter OR P.phoneNum like :filter";

		Session session = factory.openSession();
		Query query = session.createQuery(hql);
		query.setParameter("filter", filter);
		return query.list();
	}

	//TODO: editContact()
	//public void editContact() {}

	List<Person> selectAll() {
		Session session = factory.openSession();
		return session.createQuery("from Person").list();
	}

	List booleanSearch(String firstName, String lastName, String phoneNum) {
		Session session = factory.openSession();
		String hql = "from Person P where firstName = :firstName AND lastName = :lastName OR phoneNum = :phoneNum";
		Query query = session.createQuery(hql);
		query.setParameter("firstName", firstName);
		query.setParameter("lastName", lastName);
		query.setParameter("phoneNum", phoneNum);
		return query.list();
	}

	int insert(String firstName, String lastName, String phoneNum) {
		Person person = new Person(firstName, lastName, phoneNum);
		Session session = factory.openSession();
		int res = (Integer) session.save(person);
		session.close();
		return res;
	}

}