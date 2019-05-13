package com.org.alice.controllers;

import com.org.alice.config.Configurations;
import com.org.alice.data.Singleton;
import com.org.alice.models.Dealer;
import com.org.alice.models.Player;
import com.org.alice.ui.Screen;
import com.org.alice.ui.ScreenFactory;

/**
 * This class models a BlackJack game bet
 * @author Umair
 *
 */

public class Bet {
	/**
	 * The shared singleton instance for the application
	 */
	private Singleton singleton;
	
	
	/**
	 * The human player of the bet
	 */
	public Player player;
	
	/**
	 * The Bot or the computer player of the bet
	 */
	public Dealer dealer; 
	
	/**
	 * The screen factory
	 */
	private ScreenFactory screenFactory;
	
	/**
	 * The screen object
	 */
	private Screen screen;
	
	/**
	 * The amount of bet which is $100
	 */
	private double amount;
	
	/**
	 * Constructor
	 */
	public Bet() {
		// initializing attributes
		player = new Player();
		dealer = new Dealer();
		singleton = Singleton.getInstance();
		screenFactory = new ScreenFactory();
		
		// setting singleton bet to current bet
		singleton.bet = this;
		
		amount = Configurations.BET_AMOUNT;
		
		//show start screen
		updateScreen();
	}
	
	/**
	 * Shows the screen based on bet state
	 */
	public void updateScreen() {
		// Get current screen from factory based on the state
		screen = screenFactory.getScreen(singleton.state);
		
		// Show the current screen
		screen.showScreen();			
	}
	
	
	/**
	 * Getter for the amount
	 * @return double This returns the amount of bet.
	 */
	public double getAmount() {
		return amount;
	}
}