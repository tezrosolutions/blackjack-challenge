package com.org.alice.models;

/**
 * Player model
 * @author Umair
 *
 */
public class Player {
	/**
	 * The name of the dealer
	 */
	private String name;
	
	/**
	 * Player cards
	 */
	private Card[] cards;
	
	/**
	 * The amount that player has won
	 */
	private double wonAmount;
	
	/**
	 * Constructor
	 */
	public Player() {
		cards = new Card[] {new Card(), new Card()};
	}
	
	/**
	 * Getter for the name
	 * @return String Name of the player
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter for the name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter player cards
	 * @return Card[] Return the player cards
	 */
	public Card[] getCards() {
		return cards;
	}
}
