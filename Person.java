
public class Person implements Comparable <Person>{
	private String name;
	private int age;
	
	public Person (String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String toString(){
		return (name + "-Age:" + age);
	}
	public int compareTo (Person x){
		if (getAge() == x.getAge())
			return 0;
		if (getAge() < x.getAge())
			return -1;
		else
			return 1;
		
	}
}