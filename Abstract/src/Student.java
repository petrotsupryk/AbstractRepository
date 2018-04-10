
public class Student extends Person {
	/** 
	 * @param n
	 * @param m
	 */
	public Student(String n, String m) {
		super(n);
		major = m;
	}

	public String getDescription() {
		return "a student majoring " + major;
	}

	private String major;

}
