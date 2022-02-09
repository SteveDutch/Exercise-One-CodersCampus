// package com.coderscampus.week2; Funktioniert nicht nach der Übertragung vom Original-Workspace
import java.util.Scanner;

public class ReadingUserInput {
// vermutlich nicht schön, but it works
	public static void main(String[] args) {
		//wow! thanks to an IDE, daher der Vorschlag des TRY (und mehr verstanden habe ich es dadurch auch)
		try (Scanner readInput = new Scanner (System.in)) {		
			System.out.println("Type a number between 50 and 300");
			String userInput = readInput.nextLine();
			Integer convertedUserInput = Integer.parseInt(userInput);
			readInput.close();
			
			if (convertedUserInput >= 50 && convertedUserInput <= 300) {
				System.out.println("Yes!");
			} else {System.out.println("No!");

}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("that wasn't a number! programm terminates with showing the Stacktrace now!!");
			e.printStackTrace();
		}

}
}