import java.util.Arrays;

public class selectionSort {
	public static void selectionSort1(int[] x) {
	    for (int i=0; i<x.length-1; i++) {
	        for (int j=i+1; j<x.length; j++) {
	            if (x[i] > x[j]) {
	                int temp = x[i];
	                x[i] = x[j];
	                x[j] = temp;
	            }
	        }
	    }
	}
	
	
	public static void main (String [] args) {
		int[] anArray = {0,6,1,2,3,4,5,7,8,9,10,12};
		System.out.println(Arrays.toString(anArray));
		selectionSort1(anArray);
		System.out.println(Arrays.toString(anArray));
		
		
		int[] anArray2 = {0,6,1,2,3,4,5,7,8,9,10,12};
		System.out.println(Arrays.toString(anArray2));
		bubbleSort(anArray2);
		System.out.println(Arrays.toString(anArray2));
		
		int[] anArray3 = {0,6,1,2,3,4,5,7,8,9,10,12};
		System.out.println(Arrays.toString(anArray3));
		inssort(anArray3);
		System.out.println(Arrays.toString(anArray3));
	}
	
	
    private static void bubbleSort(int[] intArray) {
       
    	int n = intArray.length;
        int temp = 0;
       
        for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                       
                        if(intArray[j-1] > intArray[j]){
                                temp = intArray[j-1];
                                intArray[j-1] = intArray[j];
                                intArray[j] = temp;
                        }
                       
                }
        }

}
	
	
	public static void inssort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            while (j>=0 && arr[j] > key)
            {
                arr[i] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}
