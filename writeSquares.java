import java.util.Arrays;

public class writeSquares {

	public static void writeSquares (int n) {
		if (n==1) {
			System.out.print("1");
		}
		
		else {
			if (n%2==1) {
				System.out.print(n*n+",");
				writeSquares(n-1);
			}
			else {
				writeSquares(n-1);
				System.out.print(","+ n*n);
			}
			
		}
	}
	
	
	public static void main (String [] args) {
		writeSquares(9);
		int[] arr = {1,2,3};
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}
