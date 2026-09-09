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
	char[] onePtCollection = {'A','E','I','L','N','O','R','S','T','U'};
	char[] twoPtCollection = {'D','G'};
	char[] threePtCollection = {'B','C','M','P'};
	char[] fourPtCollection = {};
	
	public void run()
	{
		//make an instance var to keep track of the points
//		make an enum of the alphabet w a val pt associated w
		//..each letter (see pg 286 in art & sci text)
		//
		introduceApp();
		askClientForInput();
	}
	
	
	private void introduceApp()
	{
		println("The CS106A_ScrabbleMkIII class mimics the game" +
				"known as Scrabble, where each capital letter " +
				"in the English alphabet is awarded a point " +
				"inversely related to its frequency in English words.");
		pause(2000);
	}
	
	
	private void askClientForInput()
	{
		String clientInput = readLine("Enter a word. No spaces or numbers: ");
		if (checkClientInputValidityFor(clientInput)){
			handlePointsFor(clientInput);
		} else { 
			println("Invalid input. Please trya again, omitting spaces and numbers.");
			askClientForInput();
		}
	}
	
	
	private boolean checkClientInputValidityFor(String word)
	{
		StringTokenizer tokenizedString = new StringTokenizer(word);
		while (tokenizedString.hasMoreTokens()){
			String token = tokenizedString.nextToken();
			boolean firstCase = (int)token.charAt(0) < 65 || (int)token.charAt(0) > 90;
			boolean secondCase = (int)token.charAt(0) < 97 || (int)token.charAt(0) > 122;
			if (firstCase && secondCase){ return false; }
		}
		return true;
	}
	
	
	private void handlePointsFor(String word)
	{
		StringTokenizer tokenizedStr = new StringTokenizer(word);
		while (tokenizedStr.hasMoreTokens()){
			Letter token = (Letter) tokenizedStr.nextToken().charAt(0);
		}
	}
	
	/** Mutable Instance Variables  */
	private int points = 0;
}