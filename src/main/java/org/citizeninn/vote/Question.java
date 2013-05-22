package org.citizeninn.vote;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Question {
	
	public Question() {

		answers = new ArrayList<Answer>();

	}

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private ArrayList<Answer> answers;

	public void addAnswer(Answer answer) {
		answers.add(answer);
	}
	
	public ArrayList<Answer> getAvailableAnswers() {
		// TO-Do implement deep copy
		return answers;
	}

	@Override
	public String toString() {

		return getName();
	}

}
