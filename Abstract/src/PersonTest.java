
public class PersonTest {

	public static void main(String[] args) {
		
		Person[] people = new Person[2];

		// fill an array of objects Student and Employee
		people[0] = new Employee("Petya Tsupryk", 15000, 2006, 10, 1);
		people[1] = new Student("Galya Leshtak", "computer science");

		// Output of names and description of all objects
		for (Person p : people)
			System.out.println(p.getName() + "," + p.getDescription());

	}

}
