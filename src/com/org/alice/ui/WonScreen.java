package com.org.alice.ui;

import com.org.alice.config.Configurations;
import com.org.alice.utils.Console;

/**
 * Class for won screen
 * @author Umair
 *
 */
public class WonScreen  implements Screen {
	
	/**
	 * Constructor
	 */
	public WonScreen() {
	}
	
	/**
	 * Shows the corresponding screen for a given state
	 */
	public void showScreen() {
		Console.printOnScreen("");
		Console.printOnScreen(Configurations.MSG_WON);	
	}
}
