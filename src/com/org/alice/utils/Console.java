package com.org.alice.utils;

import java.util.Scanner;

/**
 * Utility for helping with console related tasks
 * @author muhammad
 *
 */
public class Console {
	/**
	 * Prints a message on screen.
	 * @param msg The message that we want to print on the console
	 */
	public static void printOnScreen(String msg) {
		System.out.println(msg);
	}
	
	
	/**
	 * Reads user's input from console
	 * @param msg The message that we want to print on the console
	 */
	public static String getUserInput(String msg) {
		Scanner inputScanner = new Scanner(System.in);  // Create a Scanner object
		Console.printOnScreen(msg);
		String input = inputScanner.nextLine(); //Read user name
		System.out.println("");
		
		//@TODO fix the inputScanner.close() problem
		
		return input;
	}
}
