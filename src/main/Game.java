package main;

import javax.swing.JOptionPane;

public class Game {
	
	public static void main (String[] args) {
		new Game();
	}
		
	public Game() {
		
		boolean done = false;
		while(!done) {
			String[] answers = new String[11];
			
			//Prompts initial message
			JOptionPane.showMessageDialog(null, "Let's Make a Story", "My Mad Lib Game", JOptionPane.INFORMATION_MESSAGE);
			
			//Set variety of colors to 'colors' array
			String[] colors = {
					"Orange",  "Green", "Blue", "Red",
					"Yellow", "Purple", "Pink", "Brown"			
			};
			
			//Prompts COLOR message with the array of 'colors'
			//Set it to type integer 'colorIndex'
			int colorIndex = JOptionPane.showOptionDialog(null, "What's your favorite color?", "Color", 0, JOptionPane.QUESTION_MESSAGE, null, colors, null);
			
			//Find color name from 'colors' array using 'colorIndex'
			//Set it to 'answers' array first index
			answers[0] = colors[colorIndex];
			
			//Prompts LIQUID message for user input
			answers[1] = JOptionPane.showInputDialog(null, "What's your favorite drink?", "Liquid", JOptionPane.QUESTION_MESSAGE);
			
			//Prompts PLURAL NOUN message for user input
			answers[2] = JOptionPane.showInputDialog(null, "What item comes in pairs?", "Plural Noun", JOptionPane.QUESTION_MESSAGE);
			
			//Prompts ADJECTIVE message for user input
			answers[3] = JOptionPane.showInputDialog(null, "Describe your favorite game in one word.", "Adjective", JOptionPane.WARNING_MESSAGE);
			
			//Prompts PRESENT TENSE VERB message for user input
			answers[4] = JOptionPane.showInputDialog(null, "Name something you do go to the gym.", "Present Tense Verb", JOptionPane.WARNING_MESSAGE);
			
			//Prompts PLURAL NOUN message for user input
			answers[5] = JOptionPane.showInputDialog(null, "Name something you own multiple of.", "Plural Noun", JOptionPane.WARNING_MESSAGE);
			
			//Prompts SINGULAR NOUN message for user input
			answers[6] = JOptionPane.showInputDialog(null, "If you wish for only one item, what would it be?", "Singluar Noun", JOptionPane.QUESTION_MESSAGE);
			
			//Prompts ADJECTIVE message for user input
			answers[7] = JOptionPane.showInputDialog(null, "Describe school in one word.", "Adjective", JOptionPane.WARNING_MESSAGE);
			
			//Prompts PRESENT TENSE VERB message for user input
			answers[8] = JOptionPane.showInputDialog(null, "What do you do at home? (present tense verb)", "Present Tense Verb", JOptionPane.QUESTION_MESSAGE);
			
			//Prompts PRESENT TENSE VERB message for user input
			answers[9] = JOptionPane.showInputDialog(null, "What do you do at school? (present tense verb)", "Present Tense Verb", JOptionPane.QUESTION_MESSAGE);
			
			//Prompts SINGULAR NOUN message for user input
			answers[10] = JOptionPane.showInputDialog(null, "Name one thing you would give to your significant other.", "Singular Noun", JOptionPane.WARNING_MESSAGE);
		
			//Prompts CONFIRM message
			int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to see the results?", "Final Question", JOptionPane.YES_NO_OPTION);
			
			//If User clicks "no", restart Mad Lib
			//Else show Mad Lib message
			if(input == 1) {
				done = false;
			}else {
				JOptionPane.showMessageDialog(
						null, 
						"<html>Each spring, the sky turns <strong>"+answers[0]+"</strong>. Giant drops of <strong>"+answers[1]+"</strong> fall from the sky. All these <strong>"+answers[1]+"</strong></html>"
						+ "\n<html>helps the grass and the <strong>"+answers[2]+"</strong> to grow, but it can make things really <strong>"+answers[3]+"</strong> too.</html>"
						+ "\n<html>Some places get so much <strong>"+answers[1]+"</strong>, that rivers <strong>"+answers[4]+"</strong> into the streets. Driving can be tricky when </html>"
						+ "\n<html>this happens, so some people put special <strong>"+answers[5]+"</strong> on their cars.</html>"
						+ "\n<html>And when the <strong>"+answers[1]+"</strong> is falling, don't forget your <strong>"+answers[6]+"</strong>. </html>"
						+ "\n<html>Otherwise, your feet might get <strong>"+answers[7]+"</strong> if you <strong>"+answers[8]+"</strong> in puddles! </html>"
						+ "\n<html>After all the <strong>"+answers[1]+"</strong> has fallen, the skies begin to <strong>"+answers[9]+"</strong>. </html>"
						+ "\n<html>If you are lucky, you might see a huge <strong>"+answers[10]+"</strong> stretched across the sky.</html>"
						, "Your Mad Lib!", JOptionPane.PLAIN_MESSAGE);
				System.exit(0);
			}
			
		}
		
	}
	
}
