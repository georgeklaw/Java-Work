
public class BikeClient {
	
public static void main(String args[]) {
	Bicycle bike = new Bicycle(1,2,3);
	Bicycle bike2 = new Bicycle(2,3,4);
	Bicycle bike3 = new Bicycle(2,3,4);
	Bicycle bike5 = new Bicycle(2,3,4);
	
	
	System.out.println(bike5.getNumberOfBicycles());
	System.out.println(bike5.getID());
	}
}