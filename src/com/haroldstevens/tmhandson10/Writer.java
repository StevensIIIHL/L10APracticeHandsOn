package com.haroldstevens.tmhandson10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Writer {

	static void write () {
		try {
			
			ArrayList<TaskManager> tasks = new ArrayList<TaskManager>();
			// creating a new object to create a file
			//File myObj = new File("songs.txt");
			
			// checking if file existed, if not then writes file, if it did then prints to console already exists
			//if ( myObj.createNewFile() ) {
				//System.out.println( "File created: " + myObj.getName() );
			//} else {
				//System.out.println( "File already exists." );
			//}
			
			
			// creating a new object to write songsToWrite String variable to songs.txt
			FileWriter taskWriter = new FileWriter( "tasks.txt" ); 
			taskWriter.write( tasks ); // writes the variable
			taskWriter.close(); // closes the file
			
			// creates a new scanner object to read text from the file
			Scanner myReader = new Scanner( myObj );
			
			// while loop to read from the file and prints to console
			while ( myReader.hasNextLine() ) {
				String songData = myReader.nextLine();
				System.out.println( songData );
			}
			
			// closes myReader object/file
			myReader.close();
		
		// catch exception if an error would be thrown and prints stack trace	
		} catch( IOException e ) {
			
			System.out.println( "An error has occurred writing songs to a file" );
			e.printStackTrace();
			
		}
	}
		
	static void read() {
		try {
			
			Scanner myReader = new Scanner( myObj );
			
			// while loop to read from the file and prints to console
			while ( myReader.hasNextLine() ) {
				String songData = myReader.nextLine();
				System.out.println( songData );
			}
			
			// closes myReader object/file
			myReader.close();
			
		} catch( IOException e ) {
			
			System.out.println( "An error has occurred writing tasks list to a file!" );
			e.printStackTrace();
		}
	}
}
