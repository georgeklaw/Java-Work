
public class Recursion {
	

	public static void main (String [] args) {
		System.out.println(mystery(7,12));
		System.out.println(mystery(37,8));
		System.out.println(mystery(8,2));
		
			
			
		}
	
	public static int mystery (int x, int y) {
		if (x<y){
			return x;
		}
		else{
			return mystery (x-y,y);
		}
		
	}
}
