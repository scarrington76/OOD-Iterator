

import java.util.Iterator;
import java.util.ArrayList;
 
public class CombinedLeagues {
	League NFL;
	League AFL;
 
	public CombinedLeagues(League nfl, League afl) {
		this.NFL = nfl;
		this.AFL = afl;
	}
	
	public void printMenu(int withNewConstructs) {
		ArrayList<Team> nflteams = ((NFL) NFL).getTeams();
		for (Team m : nflteams) {
			printTeam(m);
		}
		
		Team[] aflteams = ((AFL) AFL).getTeams();
		for (Team m : aflteams) {
			printTeam(m);
		}
	}
	
	public void printTeam(Team menuItem) {
		System.out.print(menuItem.getCity() + ", ");
		System.out.print(menuItem.getMascot() + ", ");
		System.out.println(menuItem.getRecord());
		
	}
	// ---
 
	public void printTeam() {
		Iterator<Team> nflIterator = NFL.createIterator();
		Iterator<Team> aflIterator = AFL.createIterator();

		System.out.println("****PREVIOUS NFL TEAMS****");
		printTeam(nflIterator);
		System.out.println("\n****PREVIOUS AFL TEAMS****");
		printTeam(aflIterator);
	}
 
	private void printTeam(Iterator<Team> iterator) {
		while (iterator.hasNext()) {
			Team menuItem = iterator.next();
			System.out.print(menuItem.getCity() + ", ");
			System.out.print(menuItem.getMascot() + ", ");
			System.out.println(menuItem.getRecord());
		}
	}
 
	public boolean hasDome(String name) {
		Iterator<Team> nflIterator = NFL.createIterator();
		if (hasDome(name, nflIterator)) {
			return true;
		}
		Iterator<Team> aflIterator = AFL.createIterator();
		if (hasDome(name, aflIterator)) {
			return true;
		}
		return false;
	}


	private boolean hasDome(String city, Iterator<Team> iterator) {
		while (iterator.hasNext()) {
			Team team = iterator.next();
			if (team.getCity().equals(city)) {
				if (team.isDome()) {
					return true;
				}
			}
		}
		return false;
	}
}
