/**
 * Class to represent a course object.
 * 
 * @author cawelch2
 */
public class Course {
	/**
	 * Subject field for each course.
	 */
	public String subject;

	/**
	 * Number field for each course.
	 */
	private int number;

	/**
	 * Name of each course.
	 */
	private String title;

	/**
	 * Constructor for making a new course.
	 * 
	 * @param sub the subject of the course
	 * @param myId the number of the course
	 * @param name the name of the course
	 */
	public Course(String sub, int myId, String name) {
		subject = sub.toUpperCase();
		number = myId;
		title = name;
	}

	/**
	 * toString method to print out each course object.
	 */
	public String toString() {
		return subject + " " + number + ": " + title;
	}
}
