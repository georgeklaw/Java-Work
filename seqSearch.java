

public class seqSearch {
	public static int seqSearch (int[] arr, int n) {
		  for (int index = 0; index <= arr.length-1; index++)
	      {
	           if ( arr[index] == n ) 
	                 return index;
	      }
	     return -1;
	}
	
	public static void main (String[] args) {
		int[] anArray = {1,2,3,4,5,6,7,8,9};
		int[] array2 = new int[5];
		System.out.println(seqSearch(anArray,8));
		System.out.println(anArray.length-1);
	}
}
