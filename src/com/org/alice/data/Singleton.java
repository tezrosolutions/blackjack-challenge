package com.org.alice.data;

import com.org.alice.config.Configurations;
import com.org.alice.controllers.Bet;


/**
 * Singleton instance for sharing data among all the classes in the application
 * @author Umair
 *
 */

public class Singleton 
{ 
	/**
	 * The singleton instance
	 */
    private static Singleton __instance = null; 
  
    /**
     * current state of the Bet
     */
    public int state; //[1: START, 2: INITIAL HIT, 3: STAND 4: HIT]
    
    /**
     * The Bet
     */
    public Bet bet;
    
    
    /**
     * Constructor
     */
    private Singleton() 
    { 
        state = Configurations.BET_STATE_START; //starting point
    } 
    
    /** 
     * static method to create instance of Singleton class
     * @return Singleton
     */
    public static Singleton getInstance() 
    { 
        if (__instance == null) 
        		__instance = new Singleton(); 
  
        return __instance; 
    } 
} 