package org.citizeninn.vote.dao;

import org.citizeninn.dao.GenericDAO;
import org.citizeninn.vote.Answer;
import org.citizeninn.vote.Question;

public interface QuestionDAO extends GenericDAO<Question, Long> {

	Answer getLatestAnswer(Long questionId);

}
