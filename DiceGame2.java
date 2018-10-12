import java.util.*;

public class DiceGame2 {
	
	//-----------------------------------------------------------------
	// Lets a group of players play with a pair of Die 
	// Player with the highest roll, wins the round
	//-----------------------------------------------------------------
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		DicePair dice = new DicePair(8); //we want a pair of eight sided Die  
		ArrayList<Player> players = new ArrayList<Player>();
		boolean inPlay = true;
		DiceGame2 game = new DiceGame2();

		game.getPlayers(scan, players);	

		int highScore = 0;
		while(inPlay)
		{
			// INSERT CODE HERE 
			// that randomly picks a player to go first
			// this code can be in a separate method
			highScore = game.everybodyRolls(players, dice);
			game.updateScores(players, highScore);
			inPlay = keepPlaying(scan);
		}
		game.printResults(players);
	} 

	//-----------------------------------------------------------------
	// Asks the players if they want to play another round of dice
	//-----------------------------------------------------------------
	private static boolean keepPlaying(Scanner scan)
	{
		System.out.println("\nWOULD YOU LIKE TO PLAY AGAIN? (y or n)");
		String input = scan.next();
		if(input.equals("y"))
			return true;
		return false;
	}

	//-----------------------------------------------------------------
	// Prints the scores of each player
	//-----------------------------------------------------------------
	public void printResults(ArrayList<Player> list)
	{
		System.out.println("HERE ARE THE RESULTS:");
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}

	//-----------------------------------------------------------------
	// Asks the number of players and gets each of their names
	//-----------------------------------------------------------------
	public void getPlayers(Scanner scan, ArrayList<Player> players)
	{
		int playerCount = 0;
		System.out.println("How many players will join today?");
		playerCount = scan.nextInt();
		// INSERT CODE HERE to add each player. 
		// Ask for their name.
	}

	//-----------------------------------------------------------------
	// Given a list of Players and the winning roll value, 
	// each player is notified if they won or lost.
	//-----------------------------------------------------------------
	public void updateScores (ArrayList<Player> list, int largest)
	{
		// INSERT CODE HERE
		// to update each player's statistics
	}

	//-----------------------------------------------------------------
	// Each player is given a turn to roll the dice
	// Method returns highest roll value
	//-----------------------------------------------------------------
	public int everybodyRolls(ArrayList<Player> list, DicePair dice)
	{
		int highestScore = 0;
		
		// INSERT CODE HERE
		// Allow each player to roll the dice.

		return highestScore;
	}

}