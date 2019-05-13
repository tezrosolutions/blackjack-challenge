package com.org.alice.models;

import java.util.Random; 

/**
 * Card model
 * @author Umair
 *
 */

public class Card {
	/**
	 * The vale of the card
	 */
	private int value;
	
	/**
	 * Constructor
	 */
	public Card() {
		Random rand = new Random(); 
		value = rand.nextInt(12);
	}
	
	
	/**
	 * Returns the value of card
	 * @return int The value of card
	 */
	public int getValue() {
		return value;
	}
}
