
public class RectangleClient {
	
public static void main(String args[]) {
	Rectangle r = new Rectangle(5, 12,4,8);


	System.out.println(r);
	System.out.println("Area is " + r.area());
	
	r.changeSize(3, 10);
	System.out.println(r);
	System.out.println("Area after size is changed is " + r.area());
	}
}