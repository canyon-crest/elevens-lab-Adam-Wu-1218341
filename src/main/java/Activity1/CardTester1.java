package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card1 card0 = new Card1("Ace", "Spades", 1);
		Card1 card1 = new Card1("Two", "Clubs", 2);
		Card1 card2 = new Card1("Ace", "Spades", 1);
		
		System.out.println(card0.rank());
		System.out.println(card1.pointValue());
		System.out.println(card2.suit());
		
		System.out.println(card1.toString());
		System.out.println(card0.matches(card2));
	}
}
