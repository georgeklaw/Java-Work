
public class sequentialSearch {

	public static int seqSearch (int[] arr, int n) {
		int r = 0;
		  for (int index = 0; index < arr.length; index++)
	      {
	           if ( arr[index] == n ) 
	                 r =  index;
	           else
	        	   if(arr[index]< n && n<arr[index+1])
	        	   {
	        		   r = -(index+1);
	        	   }
	      }
		  return r;
	}
	
	
	public static int binarySearch (int[] a, int x) {
		int low = 0;
	    int high = a.length - 1;
	    int mid = -1;
	      while (low <= high) {
	         mid = (low+high)/2;
	         if (a[mid] > x)
	        	 high = mid -1;
	         else
	         {
	        	 if (a[mid] <x)
	        		 low = mid+1;
	        	 else
	        		 return mid;
	         }
	      }
	      return -(mid + 1);
	}
	
	public static int RbinarySearch(int[ ] a, int x, int low, int high) {
	      if (low > high || x > high || x < low) 
	    	  return -1; 
	      int mid = (low + high)/2;
	      if (a[mid] == x) 
	    	  return mid;
	      else
	      {
	    	  if (a[mid]<x)
	    		  return RbinarySearch(a, x, mid+1, high);
	    	  else
	    		  return RbinarySearch(a, x, low, mid-1);
	      }
	   }
	
	public static void main (String[] args) {
		int[] anArray = {0,1,2,3,4,5,6,7,8,9,10,12};
		System.out.println(seqSearch(anArray,11));
		System.out.println(binarySearch(anArray,100));
		System.out.println(RbinarySearch(anArray,8,0,11));
	}
}
