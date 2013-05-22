package org.citizeninn.vote;

import javax.persistence.Embeddable;


@Embeddable
public class Answer {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
