import java.util.Collections;
import java.util.ArrayList;

public class TelDirectoryClient {
	
	public static void main(String [] args) {
		ArrayList<TelDirectory> list1 = new ArrayList<TelDirectory>();
		list1.add(new TelDirectory("Bob","123-456-7897"));
		list1.add(new TelDirectory("Rob","123-456-8363"));
		list1.add(new TelDirectory("George","123-456-8373"));
		list1.add(new TelDirectory("Elizabeth","123-456-1828"));
		list1.add(new TelDirectory("Chester","123-456-8229"));
		list1.add(new TelDirectory("Charlie","123-456-9383"));
		list1.add(new TelDirectory("Bob","123-456-3838"));
		list1.add(new TelDirectory("Bob","123-456-8383"));
		list1.add(new TelDirectory("Javier","123-456-1612"));
		list1.add(new TelDirectory("Kebina","123-456-0833"));
		
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
				
	}
}

