package com.org.alice.ui;

import com.org.alice.config.Configurations;
import com.org.alice.utils.Console;

/**
 * Class for surrender screen
 * @author Umair
 *
 */
public class SurrenderScreen  implements Screen {
	
	/**
	 * Constructor
	 */
	public SurrenderScreen() {
		
	}
	
	/**
	 * Shows the corresponding screen for a given state
	 */
	public void showScreen() {
		Console.printOnScreen("");
		Console.printOnScreen(Configurations.MSG_SURRENDER);	
	}
}
