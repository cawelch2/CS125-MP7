import java.util.Scanner;

public class Chat {

	private static Scanner myScanner;
	
	private static String[] csClass = {"CS 101", "CS 105", "CS 125"};
	private static String[] chemClass = {"CHEM 101", "CHEM 102", "CHEM 103"};
	private static String[] mathClass = {"MATH 221", "MATH 231", "MATH 241"};

	public static void startChat() {
		myScanner = new Scanner(System.in);
		System.out.println("Hello. My name is ChatBot! How can I help you?");
		String nextLine = myScanner.nextLine();
		while (!nextLine.equals("")) {
			printClasses(nextLine);
			nextLine = myScanner.nextLine();
		}
		System.out.println("Thank you for using ChatBot. Goodbye!");
	}

	public static void printClasses(String message) {
		if (message.toUpperCase().contains("CS") || message.toLowerCase().contains("computer science")) {
			System.out.println("The CS classes available are: ");
			for (int x = 0; x < csClass.length; x++) {
				System.out.println(csClass[x]);
			}
		} else if (message.toUpperCase().contains("CHEM") || message.toLowerCase().contains("chemistry")) {
			System.out.println("The CHEM classes available are: ");
			for (int x = 0; x < chemClass.length; x++) {
				System.out.println(chemClass[x]);
			}
		} else if (message.toUpperCase().contains("MATH") || message.toLowerCase().contains("mathematics")) {
			System.out.println("The MATH classes available are: ");
			for (int x = 0; x < mathClass.length; x++) {
				System.out.println(mathClass[x]);
			}
		} else {
			System.out.println("Sorry, please try again.");
		}
	}
}
