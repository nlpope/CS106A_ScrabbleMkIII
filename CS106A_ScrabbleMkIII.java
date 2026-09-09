//CS106A_ScrabbleMkIII
/**
 * File: CS106A_ScrabbleMkIII.java
 * --------------------------------------
 * The CS106A_ScrabbleMkIII class mimics the game
 * known as Scrabble, where each capital letter 
 * in the English alphabet is awarded a point 
 * inversely related to its frequency in English 
 * words.
 * 
 */

import acm.program.*;
import java.util.*;

public class CS106A_ScrabbleMkIII extends ConsoleProgram
{
	/** Immutable Instance Variables (named constants) */
	private static final String SENTINEL = "ENDGAME";
	
	public void run()
	{
		introduceApp();
		askClientForInput();
	}
	
	
	private void introduceApp()
	{
		println("The CS106A_ScrabbleMkIII class mimics the game" +
				"known as Scrabble, where each capital letter " +
				"in the English alphabet is awarded a point " +
				"inversely related to its frequency in English words.");
		pause(1000);
		println("You can play indefinitely or type '" + SENTINEL +"' to end " +
				"the program.");
		pause(2000);
	}
	
	
	private void askClientForInput()
	{
		while(true){
			String clientInput = readLine("Enter a word. No spaces or numbers: ");
			if (clientInput.equals(SENTINEL)) { 
				println("total points: " + totalPoints + ".");
				println("goodbye.");
				return; 
			}
			if (checkClientInputValidityFor(clientInput)){
				for (int i = 0; i < clientInput.length(); i++){
					handlePointsFor(clientInput.charAt(i));
				}
				println("That word is worth " + points + " points.");
				totalPoints += points;
				points = 0;
			} else { 
				println("Invalid input. Please trya again, omitting spaces and numbers.");
				askClientForInput();
			}
		}
	}
	
	
	private boolean checkClientInputValidityFor(String word)
	{
		for (int i = 0; i < word.length(); i++){
			boolean firstCase = word.charAt(i) < 65 || word.charAt(i) > 90;
			boolean secondCase = word.charAt(i) < 97 || word.charAt(i) > 122;
			if (firstCase && secondCase){ return false; }
		}
		return true;
	}
	
	
	private void handlePointsFor(Character clientLetter)
	{
		for (Letter l: Letter.values()){
			if (clientLetter.equals(l.name().charAt(0))){ points += l.pointValue; }
			else { points += 0; }
		}
	}
	
	/** Mutable Instance Variables  */
	private int points = 0;
	private int totalPoints = 0;
}