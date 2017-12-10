import java.util.Scanner;

public class Chat {

	private static Scanner myScanner;

	public static void startChat() {
		myScanner = new Scanner(System.in);
		System.out.println("Hello. My name is ChatBot! How can I help you?");
		String nextLine = myScanner.nextLine();
		while (!nextLine.equals("")) {
			if (!printClasses(nextLine).equals("")) {
				System.out.println(printClasses(nextLine));
			} else {
				System.out.println("Sorry, please try again.");
			}
			nextLine = myScanner.nextLine();
		}
		System.out.println("Thank you for using ChatBot. Goodbye!");
	}

	public static String printClasses(String message) {
		String output = "";
		if (message.toUpperCase().contains("CS") || message.toLowerCase().contains("computer science")) {
			output += "The CS classes available are: \n";
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].subject.equals("CS"))
					output += CourseArray.courses[x].toString() + "\n";
			}
			output += "\n";
		}
		if (message.toUpperCase().contains("CHEM") || message.toLowerCase().contains("chemistry")) {
			output += "The CHEM classes available are: \n";
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].subject.equals("CHEM"))
					output += CourseArray.courses[x].toString() + "\n";
			}
			output += "\n";
		}
		if (message.toUpperCase().contains("MATH") || message.toLowerCase().contains("mathematics")) {
			output += "The MATH classes available are: \n";
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].subject.equals("MATH"))
					output += CourseArray.courses[x].toString() + "\n";
			}
		}
		return output;
	}
}
