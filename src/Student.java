/**
 * Class to represent the Students using the course explorer bot.
 * 
 * @author cawelch2
 */
public class Student {
	/**
	 * Name field for a student.
	 */
	public String name;

	/**
	 * Grade of the student.
	 */
	public String grade;

	/**
	 * Constructor for making a new student object.
	 * @param person name of the person
	 * @param year the year of the person
	 */
	public Student(String person, String year) {
		name = person;
		grade = year;
	}
}
