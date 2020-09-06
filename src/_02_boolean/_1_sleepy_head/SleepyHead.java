package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		isWeekend=false;
		// Write code to ask the user what day it is.
        String day = JOptionPane.showInputDialog("What day is it?");
		// Set the boolean isWeekend based on the value they enter
		if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")) {
			isWeekend=true;
		}
		if (isWeekend) {
			JOptionPane.showMessageDialog(null, "Sleep In.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Go To School.");
		}
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		passedExam=false;
		// Write code to ask the user what percentage they scored in their last exam
String per = JOptionPane.showInputDialog("How much ,in percent, did you get on the test?"); 
int pei = Integer.parseInt(per)		;
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		if(pei>70) {
			passedExam=true;
		}
		// If the user passed the exam, congratulate them
		if(passedExam) {
			JOptionPane.showMessageDialog(null, "Good job, you passed!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Better luck next time, you failed.");
		}
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			if(gameIsOver){
				JOptionPane.showMessageDialog(null, "The Game is over.");
			}
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
isRed=false;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String col = JOptionPane.showInputDialog("What color do you want to draw with?");
		if(col.equalsIgnoreCase("Red")) {
			isRed=true;
		}
		boolean isSquare;	
		isSquare=false;
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String sha = JOptionPane.showInputDialog("What shape do you want to draw?");
		if (sha.equalsIgnoreCase("Square")) {
			isSquare=true;
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		
if(isRed && isSquare) {
	drawRedSquare();
}
	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
		rob.setPenColor(Color.RED);
		rob.penDown();
		rob.setSpeed(4);
		for (int i = 0; i < 4; i++) {
			rob.move(120);
			rob.turn(90);
		}
	}	
}
