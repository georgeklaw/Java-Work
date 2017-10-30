import java.util.ArrayList;
import java.util.Collections;

public class PersonClient {
	public static void main (String[] args) {
		ArrayList<Person> list1 = new ArrayList<Person>();
		list1.add(new Person("Bob",6));
		list1.add(new Person("George",27));
		list1.add(new Person("Lebron", 25));
		Collections.sort(list1);
		System.out.println(list1);
	}
	
}
