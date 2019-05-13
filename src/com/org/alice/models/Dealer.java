package com.org.alice.models;

/**
 * Dealer model
 * @author Umair
 *
 */
public class Dealer {
	/**
	 * The name of the dealer
	 */
	private String name;
	
	/**
	 * Player cards
	 */
	private Card[] cards;
	
	/**
	 * Constructor
	 */
	public Dealer() {
		cards = new Card[] {new Card(), new Card()};
	}
	
	/**
	 * Return the deal cards
	 * @return Card[] returns the cards
	 */
	public Card[] getCards() {
		return cards;
	}
}
