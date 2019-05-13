package com.org.alice.ui;

import com.org.alice.config.Configurations;
import com.org.alice.data.Singleton;
import com.org.alice.utils.Console;

/**
 * Class for initial hit screen
 * @author Umair
 *
 */
public class InitialHitScreen  implements Screen {
	/**
	 * The shared singleton instance for the application
	 */
	private Singleton singleton;

	/**
	 * Constructor
	 */
	public InitialHitScreen() {
		singleton = Singleton.getInstance();
	}
	
	/**
	 * Shows the corresponding screen for a given state
	 */
	public void showScreen() {
		Console.printOnScreen("You have two cards.");
		Console.printOnScreen(" ___   ___");
		Console.printOnScreen("| * | | * |");
		Console.printOnScreen("| * | | * |");
		Console.printOnScreen(" ___   ___");
		
		askPlayerIfReady();
		
	}
	
	/**
	 * Check with player if he is ready for next Step
	 */
	private void askPlayerIfReady() {
		String readyInput = Console.getUserInput(Configurations.MSG_READY_FOR_STAND_OR_WANT_ANOTHER_HIT);
		if(readyInput.equalsIgnoreCase(Configurations.MSG_ONE)) {
			singleton.state = Configurations.BET_STATE_STAND;
			singleton.bet.updateScreen();
		} else if(readyInput.equalsIgnoreCase(Configurations.MSG_TWO)) {
			askPlayerIfReady();
		} else if(readyInput.equalsIgnoreCase(Configurations.MSG_THREE)) {
			singleton.state = Configurations.BET_STATE_SURRENDER;
			singleton.bet.updateScreen();
		} else {
			Console.printOnScreen(Configurations.MSG_OPTION_UNSUPPORTED);
			askPlayerIfReady();
		}
	}
		
}
