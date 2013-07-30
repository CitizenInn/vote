package org.citizeninn.vote;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestAppQuestion {

	
	static SessionFactory sessionFactory;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		System.out.println("Working Directory = "
				+ System.getProperty("user.dir"));



		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Question question = new Question();
		question.setName("At what age person should be allowed to vote in presidential election?");

		Answer answer1 = new Answer();
		answer1.setName("16");

		Answer answer2 = new Answer();
		answer2.setName("18");

		Answer answer3 = new Answer();
		answer3.setName("21");

		question.addAnswer(answer1);
		question.addAnswer(answer2);
		question.addAnswer(answer3);
		
		session.save(question);



		
		session.getTransaction().commit();
		session.close();
		
		
		
	}
	
	@SuppressWarnings("deprecation")
	protected static void setUp() throws Exception {
	    // A SessionFactory is set up once for an application
	    sessionFactory = new Configuration()
	            .configure() // configures settings from hibernate.cfg.xml
	            .buildSessionFactory();
	}

}
