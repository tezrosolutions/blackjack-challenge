package com.org.alice.ui;

import com.org.alice.config.Configurations;
import com.org.alice.data.Singleton;
import com.org.alice.utils.Console;

/**
 * Class for start screen
 * @author Umair
 *
 */
public class StartScreen  implements Screen {
	/**
	 * The shared singleton instance for the application
	 */
	private Singleton singleton;
	
	/**
	 * Constructor
	 */
	public StartScreen() {
		singleton = Singleton.getInstance();
	}
	
	/**
	 * Shows the start screen
	 */
	public void showScreen() {
		// Read player name
		Console.printOnScreen(Configurations.MSG_START);
		String name = Console.getUserInput(Configurations.MSG_ENTER_NAME);
		Console.printOnScreen(Configurations.MSG_WELCOME + " " + name + "!");
		
	    
		askPlayerIfReady();
		
	}
	
	
	/**
	 * Check with player if he is ready for next Step
	 */
	private void askPlayerIfReady() {
		Console.printOnScreen(Configurations.MSG_BET_AMOUNT + singleton.bet.getAmount());
		String readyInput = Console.getUserInput(Configurations.MSG_READY_FOR_INITIAL_HIT);
		if(readyInput.equalsIgnoreCase(Configurations.MSG_YES)) {
			singleton.state = Configurations.BET_STATE_INITIAL_HIT;
			singleton.bet.updateScreen();
		} else {
			askPlayerIfReady();
		}
	}
		
}
