package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
	
				// 2.  Ask the user a question
		String name = JOptionPane.showInputDialog("what is 1+1?");
				// 3.  Use an if statement to check if their answer is correct
				if (name.equals("2")) {
				// 4.  if the user's answer was correct, add one to their score 
		score = score +1;
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer4
				}
		else {
		score = score-1;
		// After all the questions have been asked, tell the user their final score 
		
	}
		name = JOptionPane.showInputDialog("what is 2+2?");
		if (name.equals("4")) {
			score = score +1;
		}
		else {
			score = score -1;
		}
		JOptionPane.showMessageDialog(null, "you got "+score+" points");
	}
}
