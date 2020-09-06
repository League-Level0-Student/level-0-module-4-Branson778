package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String Nickels = JOptionPane.showInputDialog("How may nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int nickelsi = Integer.parseInt(Nickels);
		// Ask the user how many dimes they have, and convert their answer
String Dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		// Ask the user how many quarters they have, and convert their answer
int dimesi = Integer.parseInt(Dimes);
		// Calculate how much money the user has.  Hint: Use a double variable 
String Quarters = JOptionPane.showInputDialog("How many quarters do you have?");
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
int quartersi = Integer.parseInt(Quarters);
double money = (nickelsi*5 + dimesi*10 + quartersi*25)/100d;
System.out.println("$" +money);
	}
}

