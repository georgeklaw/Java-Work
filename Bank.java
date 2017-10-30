
public class Bank implements Comparable <Bank>{
	private String name;
	private int ranking;
	
	public Bank (String name, int ranking){
		this.name = name;
		this.ranking = ranking;
	}
	
	public String getName(){
		return name;
	}
	public int getRanking(){
		return ranking;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setRanking(int ranking){
		this.ranking = ranking;
	}
	public String toString(){
		return (name + "-Rank:" + ranking);
	}
	public int compareTo (Bank x){
		if (getRanking() == x.getRanking())
			return 0;
		if (getRanking() < x.getRanking())
			return -1;
		else
			return 1;
		
	}
}
