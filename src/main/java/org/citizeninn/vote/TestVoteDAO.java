package org.citizeninn.vote;

import org.citizeninn.vote.dao.QuestionDAO;
import org.citizeninn.vote.dao.QuestionDAOHibernate;

public class TestVoteDAO {

	public static void main(String[] args) {

		QuestionDAO questionDAO = new QuestionDAOHibernate();

		Question question = new Question();

		question.setName("How long should last president term?");
		questionDAO.makePersistent(question);
	}

}
