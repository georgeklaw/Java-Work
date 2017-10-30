
	public class HtmlTag implements Comparable<HtmlTag> { 
		private String x;
		private boolean y;
		
		public HtmlTag (String x, boolean y)
		{
			this.x=x;
			this.y=y;
		}
		
		public String getx() {
			return x;
		}
	
		public int compareTo(HtmlTag other) {
	    	if (x.compareTo(other.getx()) < 0) {
	    		return -1;
	    	} else if (x.compareTo(other.getx()) > 0) {
	    		return 1;
	    	} else {
	    		// same element
	    		if (y == other.y) {
	    			return 0;
	    		} else if (y!=other.y) {  
	    			return -1;
	    		} else {
	    			return 1;
	    		}
	    	}
	    }
		
		public String toString(){
			return x +","+ y;
		}
}
