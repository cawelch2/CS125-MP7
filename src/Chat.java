import java.util.Scanner;

/**
 * Class where the bot is defined and reads user inputs.
 * 
 * @author cawelch2
 */
public class Chat {

	/**
	 * Scanner used to read user inputs.
	 */
	private static Scanner myScanner;

	/**
	 * Method that Illinois Course Explorer Bot uses to communicate with the user.
	 */
	public static void startChat() {
		myScanner = new Scanner(System.in);
		System.out.println("Hello. My name is Illinois Course Explorer Bot!");
		System.out.println("Please tell me your name.");
		String name = myScanner.nextLine();
		System.out.println("Please tell me your grade level.");
		String year = myScanner.nextLine();
		Student s1 = new Student(name, year);
		System.out.println("Nice to meet you, " + s1.name + "! How can I help you?");
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

	/**
	 * Method to print out the classes depending on user input.
	 * @param message the user input
	 * @return string with courses corresponding to user input
	 */
	public static String printClasses(String message) {
		String output = "";
		if (message.toUpperCase().contains("ART") || message.toLowerCase().contains("drawing")) {
			output += "The ART classes available are: \n";
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].subject.equals("ART"))
					output += CourseArray.courses[x].toString() + "\n";
			}
			output += "\n";
		}
		if (message.toUpperCase().contains("ASTR") || message.toLowerCase().contains("stars")) {
			output += "The ASTR classes available are: \n";
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].subject.equals("ASTR"))
					output += CourseArray.courses[x].toString() + "\n";
			}
			output += "\n";
		}
		if (message.toUpperCase().contains("ENG") || message.toLowerCase().contains("bardeen quad")) {
			output += "The ENG classes available are: \n";
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].subject.equals("ENG"))
					output += CourseArray.courses[x].toString() + "\n";
			}
			output += "\n";
		}
		if (message.toUpperCase().contains("BIOE") || message.toLowerCase().contains("biology")) {
			output += "The BIOE classes available are: \n";
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].subject.equals("BIOE"))
					output += CourseArray.courses[x].toString() + "\n";
			}
			output += "\n";
		}
		if (message.toUpperCase().contains("CHEM") || message.toLowerCase().contains("science")) {
			output += "The CHEM classes available are: \n";
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].subject.equals("CHEM"))
					output += CourseArray.courses[x].toString() + "\n";
			}
			output += "\n";
		}
		if (message.toUpperCase().contains("CS") || message.toLowerCase().contains("computer")) {
			output += "The CS classes available are: \n";
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].subject.equals("CS"))
					output += CourseArray.courses[x].toString() + "\n";
			}
			output += "\n";
		}
		if (message.toUpperCase().contains("ECON") || message.toLowerCase().contains("business")) {
			output += "The ECON classes available are: \n";
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].subject.equals("ECON"))
					output += CourseArray.courses[x].toString() + "\n";
			}
			output += "\n";
		}
		if (message.toUpperCase().contains("MATH") || message.toLowerCase().contains("calculus")) {
			output += "The MATH classes available are: \n";
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].subject.equals("MATH"))
					output += CourseArray.courses[x].toString() + "\n";
			}
			output += "\n";
		}
		if (message.toUpperCase().contains("PHYS") || message.toLowerCase().contains("science")) {
			output += "The CS classes available are: \n";
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].subject.equals("CS"))
					output += CourseArray.courses[x].toString() + "\n";
			}
			output += "\n";
		}
		if (message.toUpperCase().contains("RHET") || message.toLowerCase().contains("writing")) {
			output += "The RHET classes available are: \n";
			for (int x = 0; x < CourseArray.courses.length; x++) {
				if (CourseArray.courses[x].subject.equals("RHET"))
					output += CourseArray.courses[x].toString() + "\n";
			}
			output += "\n";
		}
		return output;
	}
}
