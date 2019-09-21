

import java.util.Iterator;

public class AFL implements League {
	static final int MAX_TEAMS = 10;
	int numberOfTeams = 0;
	Team[] teams;
  
	public AFL() {
		teams = new Team[MAX_TEAMS];
 
		addTeam("Cincinnati", "Bengals", true, "5-10");
		addTeam("Miami", "Dolphins", false, "10-5");
		addTeam("Boston", "Patriots", false, "8-7");
		addTeam("Buffalo", "Bills",	false, "3-12");
		addTeam("Denver", "Broncos", false, "8-7");
		addTeam("Houston", "Oilers", true, "9-6");
	}
  
	public void addTeam(String city, String mascot, 
	                     boolean dome, String record) 
	{
		Team team = new Team(city, mascot, dome, record);
		if (numberOfTeams >= MAX_TEAMS) {
			System.err.println("Sorry, the league is full! Join another league!");
		} else {
			teams[numberOfTeams] = team;
			numberOfTeams = numberOfTeams + 1;
		}
	}
 
	public Team[] getTeams() {
		return teams;
	}
  
	public Iterator<Team> createIterator() {
		return new LeagueIterator(teams);
	}
 
}
