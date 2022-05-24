package com.haroldstevens.tmhandson10;

import java.util.Scanner;

public class Input {
	
	@SuppressWarnings( "resource" )
	public static String readInputString() {
		
		// declare a new Scanner object
		Scanner sc = new Scanner( System.in );
		
		String scanned = sc.nextLine();
		
		return scanned;
	}
	
	@SuppressWarnings( "resource" )
	public static int readInputInt() {
		
		// declare a new Scanner object
		Scanner sc = new Scanner( System.in );
		
		while(!sc.hasNextInt()) {
			System.out.print( "Enter a # that corresponds with the menu: " );
			sc.next();
		}
		
		int scanned = sc.nextInt();
		return scanned;
		
	}
}
