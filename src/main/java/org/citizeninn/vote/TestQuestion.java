package org.citizeninn.vote;

public class TestQuestion {

	public static void main(String[] args) {

		Question question = new Question();

		question.setName("How much we should increase budet of healthcare");

		Answer answer1 = new Answer();

		answer1.setName("20health%");

		Answer answer2 = new Answer();

		answer2.setName("2%");

		question.addAnswer(answer1);
		question.addAnswer(answer2);

		System.out.println(question.getName());
		System.out.println("");
		for (Answer a : question.getAvailableAnswers()) {

			System.out.println(a.getName());

		}

	}

}
