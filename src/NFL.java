

import java.util.ArrayList;
import java.util.Iterator;

public class NFL implements League {
	ArrayList<Team> teams;
 
	public NFL() {
		teams = new ArrayList<Team>();
    
		addTeam("Baltimore", "Colts", false, "10-6");
 
		addTeam("Cleveland", "Browns", false, "1-15");
 
		addTeam("Pittsburgh", "Steelers", false, "13-3");
 	}

	public void addTeam(String city, String mascot,
	                    boolean dome, String record)
	{
		Team team = new Team(city, mascot, dome, record);
		teams.add(team);
	}
 
	public ArrayList<Team> getTeams() {
		return teams;
	}
  
	public Iterator<Team> createIterator() {
		return teams.iterator();
	}
  
}
