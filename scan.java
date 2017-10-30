import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scan {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("/Users/georgelaw/Desktop/input");
        Scanner scan = new Scanner(text);
          

       //reverseLines(scan);
       copy(scan);
        
        
    }
    
    public static void reverseLines(Scanner input) { 
    	if (input.hasNextLine()) {
        // recursive case
    		String line = input.nextLine();
    		reverseLines(input);
        	System.out.println(line); }
}
    
    public static void copy(Scanner input) { 
    	if (input.hasNext()) {
            // recursive case
    String line = input.nextLine();
            copy(input);
    System.out.println(line); }
    }
    
    private static void crawl(File f, String indent) { 
    	System.out.println(indent + f.getName());
    	if (f.isDirectory()) {
            // recursive case; print contained files/dirs
    		for (File subFile : f.listFiles()) { 
    			crawl(subFile, indent + " ");
    } }
    }
    }