public class Course {
	public String subject;
	private int number;
	private String title;
	
	public Course(String sub, int myId, String name) {
		subject = sub.toUpperCase();
		number = myId;
		title = name;
	}
	
	public String toString() {
		return subject + " " + number + ": " + title;
	}
}
