package com.org.alice.config;

/**
 * Configurations for the application
 * @author Umair
 *
 */

public class Configurations {
	/**
	 * Defining bet states
	 */
	public static final int BET_STATE_START = 1;
	public static final int BET_STATE_INITIAL_HIT = 2;
	public static final int BET_STATE_STAND = 3;
	public static final int BET_STATE_HIT = 4;
	public static final int BET_STATE_WON = 5;
	public static final int BET_STATE_LOST = 6;
	public static final int BET_STATE_SURRENDER = 7;
	
	
	/**
	 * Messages 
	 */
	public static final String MSG_START = "**** Welcome to BlackJack ****";
	public static final String MSG_ENTER_NAME = "Enter name:";
	public static final String MSG_WELCOME = "Welcome";
	public static final String MSG_READY_FOR_INITIAL_HIT = "Ready for \"INITIAL HIT\"? (y/n)";
	
	public static final String MSG_READY_FOR_STAND_OR_WANT_ANOTHER_HIT = "Select an option from 1-5? (Enter 1 for STAND or 2 for ANOTHER HIT or 3 for SURRENDER or 4 for DOUBLE DOWN or 5 for SPLIT)";

	public static final String MSG_SOMETHING_WENT_WRONG = "Something went wrong, please run this bet again.";
	public static final String MSG_WON = "YOU WON $100!";
	public static final String MSG_LOST = "YOU LOST! Better luck next time.";
	public static final String MSG_SURRENDER = "YOU SURRENDERED! Saved $50.";
	public static final String MSG_BET_AMOUNT = "Bet amount $";
	public static final String MSG_OPTION_UNSUPPORTED = "This feature is not supported yet.";
	
	/**
	 * Inputs configurations
	 */
	public static final String MSG_YES = "Y";
	public static final String MSG_NO = "N";
	public static final String MSG_ONE = "1";
	public static final String MSG_TWO = "2";
	public static final String MSG_THREE = "3";
	public static final String MSG_FOUR = "4";
	public static final String MSG_FIVE = "5";
	
	
	/**
	 * Misc configurations
	 */
	public static final double BET_AMOUNT = 100;
	
	
	
}
