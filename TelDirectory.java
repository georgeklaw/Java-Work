


public class TelDirectory implements Comparable<TelDirectory> {
	private String name;
	private String phonenumber;
	
	public TelDirectory (String name, String phonenumber) {
		this.name = name;
		this.phonenumber = phonenumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhonenumber (String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}
		
	public int compareTo (TelDirectory x) {
		if (!(x instanceof TelDirectory)){
			return 0;
		}
		if (this.name == null)
			return 0;
		if (this.name == x.name)
		return this.phonenumber.compareTo(x.getPhonenumber());
		return this.name.compareTo(x.getName());
	}
	
	public String toString(){
		return name+", "+phonenumber;
	}
}
