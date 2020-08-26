/* Stephanie Buckingham
 * Programming Fundamentals
 * Summer Session II
 * Programming Assignment 4
 * 8/22/2020
 * 
 * Write a program that implements a Set data structure using a singly linked list
 * implementation and a driver program that will test this implementation.
 * 
 * The Set ADT should support the following operations:
 * 1. add(x) – adds the integer x to the collection. The resulting collection should not contain any duplicate
 * values.
 * 2. delete(x) – deletes the integer x from the set.
 * 3. exists(x) – returns true if the integer x exists in the set and false otherwise.
 * 4. toString() – returns a string representing the set as a space separated list.
 */

import java.util.Scanner;

public class Test {

	public static void main(String[] arg) {

		// Print out program header
		System.out.println("Programming Fundamentals");
		System.out.println("Stephanie Buckingham");
		System.out.println("PROGRAMMING ASSIGNMENT 4-Set AD\n");

		Set set = new Set();

		// Create new scanner for userInput
		Scanner userInput = new Scanner(System.in);

		// Initialize string for userInput;
		String stringInput;

		// Infinite loop to prompt user to enter one of 3 commands, followed by an
		// integer x
		while (true) {
			System.out.print("Enter Command: ");
			stringInput = userInput.nextLine();

			// Initialize variables to send to set
			String[] splitInput = new String[2];
			String userCommand;
			int integer;

			// Split user input by the space and set index 0 to userCommand and 1 to integer
			splitInput = stringInput.split(" ");
			userCommand = splitInput[0];
			integer = Integer.parseInt(splitInput[1]);

			// Try/catch statement to make sure number is integer
			try {

				// Switch statement to select correct method per command
				switch (userCommand) {

				case "add":
					set.add(integer);
					System.out.println(set.toString());
					break;

				case "del":
					set.del(integer);
					System.out.println(set.toString());
					break;

				case "exists":
					System.out.println(set.exists(integer));
					break;

				default:
					System.out.println("Please enter a valid command");
					break;
				}
			} catch (Exception e) {
				System.out.println("Please enter valid number");

			}
		}
	}
}
