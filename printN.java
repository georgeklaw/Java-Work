
public class printN {

	public static void main (String [] args) {
		printN(10);
		printN(1);
	}
	
	public static void printN(int n) {
		if(n==1)
			System.out.print("N:" + n + " ");
		else {
			printN(n-1);
			System.out.print(n + " ");
		}
	}
}
