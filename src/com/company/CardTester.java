package com.company;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card one = new Card("one", "clubs", 1);
		Card two = new Card("47", "boxes", 12);
		Card three = new Card("one", "clubs", 1);
		System.out.println(one.toString());
		System.out.println(one.pointValue());
		System.out.println(one.rank());
		System.out.println(one.suit());
		System.out.println(one.matches(two));
		System.out.println(one.matches(three));
	}
}
