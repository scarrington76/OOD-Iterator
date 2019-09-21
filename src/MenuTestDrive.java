

public class MenuTestDrive {
	public static void main(String args[]) {
		NFL nfl = new NFL();
		AFL afl = new AFL();
		CombinedLeagues combinedleague = new CombinedLeagues(nfl, afl);
		
		System.out.println("Announcing the new combined 1966 NFL League!!!\n");
		combinedleague.printTeam();
		
		System.out.println("\nFan asks, does Denver have a dome in the new league?");
		System.out.print("Commissioner Replies: ");
		if (combinedleague.hasDome("Denver")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("\nFan asks, does Houston have a dome in the new league?");
		System.out.print("Commissioner Replies: ");
		if (combinedleague.hasDome("Houston")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
