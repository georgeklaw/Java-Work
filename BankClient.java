import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BankClient {
	public static void main (String[] args) {
		ArrayList<Bank> list1 = new ArrayList<Bank>();
		list1.add(new Bank("Wells Fargo",38));
		list1.add(new Bank("Bank of America",8));
		list1.add(new Bank("JP Morgan",3));
		Collections.sort(list1);
		System.out.println(list1);
	}
	
}
