package com.haroldstevens.tmhandson10;

// main class
public class MainApp {

	// main method
	public static void main(String[] args) {
		
		try {
			// run start program and run menu
			DisplayMenu.runMenu();
		} catch ( Exception e ) {
			e.printStackTrace();
		}

	} // main
} // MainApp
