package org.citizeninn.vote;

import org.citizeninn.User;
import org.hibernate.Session;

public class TestAppUser {

	static Session session;

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		session = HibernateUtil.setUp();
		session.beginTransaction();

		User user = new User();

		user.setFirstName("Boris");
		user.setLastName("Tarasov");
		user.setGender(0);

		session.save(user);

		session.getTransaction().commit();
		session.close();

	}



}
