package org.citizeninn.vote.dao;

import org.citizeninn.dao.GenericHibernateDAO;
import org.citizeninn.vote.Answer;
import org.citizeninn.vote.Question;
import org.hibernate.Query;

public class QuestionDAOHibernate extends GenericHibernateDAO<Question, Long>
		implements QuestionDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.citizeninn.vote.dao.QuestionDAO#getLatestAnswer(java.lang.Long)
	 */
	public Answer getLatestAnswer(Long questionId) {
		Query q = getSession().getNamedQuery("getLatestAnswer");
		q.setParameter("questionId", questionId);
		return (Answer) q.uniqueResult();
	}


}
