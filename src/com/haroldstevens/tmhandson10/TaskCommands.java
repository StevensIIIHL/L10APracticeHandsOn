package com.haroldstevens.tmhandson10;

import java.io.*;
import java.util.ArrayList;

class TaskCommands {
	
	static ArrayList<TaskManager> tasks = new ArrayList<TaskManager>();
	
	// add task
	public static void addTask(String name) {
		tasks.add( new TaskManager(name));
	} // addTask
	
	// remove tasks
	public static void removeTask(int id) {
		tasks.remove( id - 1 );
	} // removeTask

	// complete tasks
	public static void completeTask(int id) {
		tasks.get( id - 1 ).setComplete( true );
	} // completeTask
	
	// list tasks
	public static void listTasks() {
		System.out.println( "\n--To Do List--" );
		for( int i = 0; i < tasks.size(); i++ ) {
			System.out.println( i+1 + ". " + tasks.get(i).toString() );
		}
		System.out.println( "\n==================================" );
	} // listTasks
	
	// write tasks text file
	static void write() {
		     
		try {
			
			try (FileWriter writer = new FileWriter( "tasks.txt" )) {
				for(TaskManager arr : tasks ) {
					System.out.println( arr );
					writer.write( arr + System.lineSeparator() );
				}
				writer.close();
			} catch ( IOException e ) {
				e.printStackTrace();
			}
			
		} catch ( Exception e) {
			System.out.println( "--An error has occurred trying to write tasks lists to a file!--" );
			e.printStackTrace();
		}
	}
	
	// read tasks te1xt file
} // TaskManager
