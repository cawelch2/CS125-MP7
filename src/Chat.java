import java.util.Scanner;

public class Chat {

	private static Scanner myScanner;

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
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].title.equals("CS"))
					System.out.println(CourseArray.courses[x].toString());
			}
		} else if (message.toUpperCase().contains("CHEM") || message.toLowerCase().contains("chemistry")) {
			System.out.println("The CHEM classes available are: ");
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].title.equals("CHEM"))
					System.out.println(CourseArray.courses[x].toString());
			}
		} else if (message.toUpperCase().contains("MATH") || message.toLowerCase().contains("mathematics")) {
			System.out.println("The MATH classes available are: ");
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].title.equals("MATH"))
					System.out.println(CourseArray.courses[x].toString());
			}
		} else {
			System.out.println("Sorry, please try again.");
		}
	}
}
