import java.util.*;



public class htmltagClient {
	public static void main (String [] args) {
		
	TreeSet<HtmlTag> tags = new TreeSet<HtmlTag>();
	tags.add(new HtmlTag("body", true)); 
	tags.add(new HtmlTag("b", true));
	tags.add(new HtmlTag("b", false));
	tags.add(new HtmlTag("i", true));
	tags.add(new HtmlTag("b", true));
	tags.add(new HtmlTag("b", false));
	tags.add(new HtmlTag("br",false));
	tags.add(new HtmlTag("i", false));
	tags.add(new HtmlTag("body", false));
	
	Iterator it1 =tags.iterator();
	while(it1.hasNext()){
	      Object o1 = it1.next();
	      System.out.println(o1);
	    }
	}
}
