package com.org.alice.ui;

import com.org.alice.config.Configurations;

/**
 * Factory for the screens
 * @author muhammad
 *
 */

public class ScreenFactory {

	/**
	 * Use getScreen method to get object of type Screen
	 * @param screenType
	 * @return Screen The screen as per the state
	 */
	public Screen getScreen(int screenType) {
		if(screenType == Configurations.BET_STATE_START) {
			return new StartScreen();
		} else if(screenType == Configurations.BET_STATE_INITIAL_HIT) {
			return new InitialHitScreen();
		} else if(screenType == Configurations.BET_STATE_STAND) {
			return new StandScreen();
		} else if(screenType == Configurations.BET_STATE_WON) {
			return new WonScreen();
		} else if(screenType == Configurations.BET_STATE_LOST) {
			return new LostScreen();
		} else if(screenType == Configurations.BET_STATE_SURRENDER) {
			return new SurrenderScreen();
		} else {
			return null;
		} 
	}

}