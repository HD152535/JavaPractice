package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		String[] questions = { "1. 가장 좋아하는 가수는?", "2. 가장 좋아하는 배우는?", "3. 가장 좋아하는 과목은?" };
		String[] answers = { "트와이스", "공유", "운동" };

		for (int i = 0; i < 3; i++) {
			System.out.printf(questions[i]);

			Scanner scanner = new Scanner(System.in);
			String answer = scanner.nextLine();
			answer = answer.trim();

			if (answer.equals(answers[i])) {
				System.out.println("정답입니다!");
			} else {
				System.out.println("틀렸습니다");
			}

		}

		for (int j = 0; j < 3; j++) {
			StringBuilder sb = new StringBuilder(questions[j]);
			sb.append(answers[j]);
			System.out.println(sb);
			
			
		}

	}

}
