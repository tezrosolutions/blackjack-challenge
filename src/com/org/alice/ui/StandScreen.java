package com.org.alice.ui;


import com.org.alice.config.Configurations;
import com.org.alice.data.Singleton;
import com.org.alice.models.Card;
import com.org.alice.utils.Console;

/**
 * Class for stand screen
 * @author Umair
 *
 */
public class StandScreen implements Screen {
	/**
	 * The shared singleton instance for the application
	 */
	private Singleton singleton;
	
	/**
	 * Constructor
	 */
	public StandScreen() {
		singleton = Singleton.getInstance();
	}

	/**
	 * Shows the stand screen
	 */
	public void showScreen() {

		Card[] playerCards = singleton.bet.player.getCards();
		Card[] dealerCards = singleton.bet.dealer.getCards();
		
		int playerCardOneValue = playerCards[0].getValue();
		int playerCardTwoValue = playerCards[1].getValue();
		
		int playerTotal = playerCardOneValue + playerCardTwoValue;
		
		int dealerCardOneValue = dealerCards[0].getValue();
		int dealerCardTwoValue = dealerCards[1].getValue();
		
		int dealerTotal = dealerCardOneValue + dealerCardTwoValue;

		
		if (playerCards.length == 2 && dealerCards.length == 2) {

			Console.printOnScreen("Your Cards");
			Console.printOnScreen(" ___   ___");
			Console.printOnScreen("| " + playerCardOneValue + " | | "
					+ playerCardTwoValue + " |");
			Console.printOnScreen("| * | | * |");
			Console.printOnScreen(" ___   ___");
			
			
			Console.printOnScreen("Dealer Cards");
			Console.printOnScreen(" ___   ___");
			Console.printOnScreen("| " + dealerCardOneValue + " | | "
					+ dealerCardTwoValue + " |");
			Console.printOnScreen("| * | | * |");
			Console.printOnScreen(" ___   ___");
			
			
			if(playerTotal > dealerTotal) {
				singleton.state = Configurations.BET_STATE_WON;
				singleton.bet.updateScreen();
			} else {
				singleton.state = Configurations.BET_STATE_LOST;
				singleton.bet.updateScreen();
			}
			
			
		} else {
			Console.printOnScreen(Configurations.MSG_SOMETHING_WENT_WRONG);
		}

	}

}
