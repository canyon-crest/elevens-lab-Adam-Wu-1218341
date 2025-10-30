package Activity2;

import java.util.List;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		List<Card2> cards;
		int size;
		
		String[] ranks = {"jack", "queen", "king"}; 
		String[] suits = {"blue", "red"}; 
		int[] pointValues = {11, 12, 13}; 
		
		Deck2 d = new Deck2(ranks, suits, pointValues);
		
		System.out.println(d.isEmpty());
		
		System.out.println(d.size());
		
		System.out.println(d.deal());
	}
}
