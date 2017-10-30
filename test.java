import java.util.Scanner;

public class test {
	public static void main (String [] args) {
		printBinary(42);
		
	}
	public static void printBinary(int n) {
		if (n < 2) {
		        // base case; same as base 10
		        System.out.println(n);
		    } else {
	
		    		// recursive case; break number apart
		    		printBinary(n / 2);
		    		printBinary(n%2);
		    }
	}
	public static int sum(int n)
	{

		if(n == 0)
		return 0;

		return sum(n-1) + n;
		}
	
	
	public static double harmonic(int N)
	{
	if (N == 0) {
	return 0.0;
	} else {
	return (1.0/N + harmonic(N-1));
	}
	}
	
	public static void copy(Scanner input) { 
		if (input.hasNext()) {
	        // recursive case
	String line = input.next();
	        copy(input);
	System.out.println(line); }
	}
}
