package Assignment03;

import java.util.*;

/**
 * Name: Nishant Pokhrel 
 * Date: September 17, 2021 
 * Subject: CS 216- Data Structures & Algorithms 
 * Assignemt: Week03 
 * Purpose: This program prompts user to add various book titles and tests 
 * all thoroughly tests all the methods present in PileOfBooks.java class.
 * @author NPokhrel
 */
public class PileOfBooksDemo {

	public static void main(String[] args) {
		
		String books; //to store the user input for names of the book
		int numBooks; //to store the use input for number of books
		
		//Creating a bag aNode to store the lists of book
		PileInterface<String> aNode = new PileOfBooks<String>();

		//Creating scanner object to take user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many books do you plan to add in the bag ?");
		numBooks = input.nextInt();
		System.out.println("**********************************************");
		System.out.println("Add the books of your choice to store in the bag."
				+ "\nString input in camelCase is suggested:toKillAMockingBird ");

		// using for loop to store user-inputed names of books
		for (int index = 0; index < numBooks; index++) {
			System.out.print(" Book " + (index + 1) + " : ");
			books = input.next();
			aNode.add(books); // storing user input in aNode
		}
		input.close();
		System.out.println(" ");

		// displaying the books stored
		System.out.println("Books stored in the bag are: ");
		displayBag(aNode);
		System.out.println("***********************************************");

		// removing the book present at the top
		System.out.println(aNode.remove() + " was present at the top. It has been removed now.");
		System.out.println();

		// Printing the remaining lists of books
		System.out.println("Remaining books present are: ");
		displayBag(aNode);
		System.out.println("***********************************************");

		// showing the book present at the top
		System.out.println("Finding out the book present at the top !");
		System.out.println("The book, " + aNode.getTopBook() + ", is located at the top.");
		System.out.println();

		System.out.println("Checking if the bag is empty or not!");
		// checking if the bag is empty or not
		if (aNode.isEmpty() == true) {
			System.out.println("Yes, the bag is empty.");
		} else {
			System.out.println("No, the bag is not empty.");
		}
		System.out.println(" ");
		System.out.println("***********************************************");

		// Clearing the items present in the bag.
		aNode.clear();
		System.out.println("Checking if the bag is empty or not!");
		if (aNode.isEmpty() == true) {
			System.out.println("Yes, the bag is empty.");
		} else {
			System.out.println("No, the bag is not empty.");
		}
		System.out.println(" ");
		System.out.println("I hope all the methods used in PileOfBooks.java have been checked. "
				+ "\nGood Bye!!"
				+ "\n#################################################################");

	}

	// creating displayBag method to print items stored in a bag
	// semicolon is used to separate books
	private static void displayBag(PileInterface<String> aNode) {
		Object[] pileOfBooks = aNode.toArray();
		for (int index = 0; index < pileOfBooks.length; index++) {
			System.out.print(pileOfBooks[index] + "; ");
		}
		System.out.println(" ");

	}

}
