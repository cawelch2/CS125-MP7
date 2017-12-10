public class Course {
	public String title;
	private int id;
	public String term;
	
	public Course(String name, int myId, String sem) {
		title = name.toUpperCase();
		id = myId;
		term = sem;
	}
	
	public String toString() {
		return title + " " + id + " " + term;
	}
}
