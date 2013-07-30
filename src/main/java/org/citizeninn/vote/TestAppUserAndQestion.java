package org.citizeninn.vote;

import java.util.List;

import org.citizeninn.User;
import org.hibernate.Session;
import org.hibernate.criterion.Example;

public class TestAppUserAndQestion {

	static Session session;

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		session = HibernateUtil.setUp();
		session.beginTransaction();

		User user = (User) session.get(User.class, new Long(1));

		Question question = (Question) session.get(Question.class, new Long(1));

		System.out.println(question.getName());

		Opinion opinion = new Opinion();

		opinion.setUser(user);


		Answer exampleAnswer = new Answer();

		exampleAnswer.setQuestion(question);

		List results = session.createCriteria(Answer.class)
				.add(Example.create(exampleAnswer)).list();

		System.out.println("Possible answers for " + question.getName());

		for (Object an : results) {

			Answer answer = (Answer) an;

			System.out.println(answer.getName());
		}

		// session.save(user);

		session.getTransaction().commit();
		session.close();

	}



}
