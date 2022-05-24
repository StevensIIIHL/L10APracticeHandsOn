package com.haroldstevens.tmhandson10;

import java.util.ArrayList;
//import java.util.Scanner;

public class DisplayMenu {

	static ArrayList<TaskManager> tasks;

	@SuppressWarnings("finally")
	public static void runMenu() {

		boolean running = true;

		do {

			// sc.close();

			menu();
			int menuChoice = Input.readInputInt();

			switch (menuChoice) {
			case 1:
				System.out.print("\nWhat do you want to add: ");
				String taskName = Input.readInputString();
				TaskCommands.addTask(taskName);
				break;
			case 2:
				
				/*
				 * if(tasks.size() == 0){ System.out.println( "tasks ArrayList size: " +
				 * tasks.size() ); break; }
				 */
				 
				try {
					System.out.print("\nTo go back to the main menu, enter 0!");
					System.out.print("\nWhat do you want to remove: ");
					int removeId = Input.readInputInt();
	
					if(removeId == 0) {break;}
					TaskCommands.removeTask(removeId);
					break;
				} catch ( Exception e ) {
					System.out.println( "\nThere are no tasks!" );
					//e.printStackTrace();
				} finally {
					break;
				}
			case 3:
				if (tasks.size() == 0) {
					break;
				}
				System.out.print("\nWhich task to complete: ");
				TaskCommands.listTasks();
				int completeId = Input.readInputInt();
				TaskCommands.completeTask(completeId);
				break;
			case 4:
				// list method
				TaskCommands.listTasks();
				break;
			case 5:
				TaskCommands.write();
				break;
			case 0:
				running = false;
				break;
			default:
				System.out.println("\nUNKNOWN");
			}
		} while (running);

	}

	public static void menu() {
		System.out.print( "\033[H\033[2J" );
		System.out.flush();
		System.out.println("\n ------Task Master-----");
		System.out.println("------------------------");
		System.out.println("1.| Add to the list");
		System.out.println("2.| Remove from the list");
		System.out.println("3.| Complete the task");
		System.out.println("4.| List the tasks");
		System.out.println("5.| Write tasks list to a file");
		System.out.println("0.| End of Line----");
		System.out.println("------------------------");
		System.out.print("  | Your choice: ");
	}

}
