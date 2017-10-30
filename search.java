
public class search {
	
	public static void main (String [] args) {
		int[] anArray = {-4, 2, 7, 9, 15, 19, 25, 28, 30, 36, 42, 50, 56, 68, 85, 92};
		int a = anArray.length;
		System.out.println(a);
		System.out.print("Answer: " + binarySearch(anArray, 42));
	}
	
	
	public static int binarySearch(int[] a, int target) {
		int min = 0;
		int max = a.length - 1;
		while (min <= max) {
			System.out.println("Min: " + min + " Max: " + max);
			int mid = (min + max) / 2;
			System.out.println("Mid: " + mid);
			if (a[mid] < target) {
				System.out.println("INDEX1: " + a[mid]);
				min = mid + 1;
				System.out.println("Min: " + min);
				} 
			else if (a[mid] > target) {
				max = mid - 1;
				System.out.println("INDEX2: " + a[mid]);
				System.out.println("Max: " + max);
				} 
			else {
				return mid; // target found
			}
			}
				return -(min + 1); // target not found
		}
	
	
}
