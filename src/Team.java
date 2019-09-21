

public class Team {
	String city;
	String mascot;
	boolean dome;
	String record;
 
	public Team(String city, 
	                String mascot, 
	                boolean dome, 
	                String record) 
	{
		this.city = city;
		this.mascot = mascot;
		this.dome = dome;
		this.record = record;
	}
  
	public String getCity() {
		return city;
	}
  
	public String getMascot() {
		return mascot;
	}
  
	public String getRecord() {
		return record;
	}
  
	public boolean isDome() {
		return dome;
	}
}
