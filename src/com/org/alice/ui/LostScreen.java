package com.org.alice.ui;

import com.org.alice.config.Configurations;
import com.org.alice.utils.Console;

/**
 * Class for initial hit screen
 * @author Umair
 *
 */
public class LostScreen  implements Screen {
	
	/**
	 * Constructor
	 */
	public LostScreen() {
	}
	
	/**
	 * Shows the corresponding screen for a given state
	 */
	public void showScreen() {
		Console.printOnScreen("");
		Console.printOnScreen(Configurations.MSG_LOST);
	}
	
}
