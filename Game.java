package technopoly;

public class Game {
	
	public static Area[] gameBoard = new Area[10];
	public static Player[] players;
	public static final int STARTING_MONEY_DEFAULT = 2000;
	public static boolean gameFinished = false;
	
	public static int MAX_ROLL = 8;

	public static void main(String[] args) {
		setUpBoard();
		
		//Prompt, how many players? Then use that value to initialise players array, indicating num playing
		players = new Player[4];
		
		setUpPlayers();
		
		gamePlaying();
		

	}
	
	public static void setUpPlayers() {
		Player p1 = new Player("Adam", STARTING_MONEY_DEFAULT);
		Player p2 = new Player("Barry", STARTING_MONEY_DEFAULT);
		Player p3 = new Player("Calvin", STARTING_MONEY_DEFAULT);
		Player p4 = new Player("Darryl", STARTING_MONEY_DEFAULT);
		
		addPlayerToPlayerList(p1);
		addPlayerToPlayerList(p2);
		addPlayerToPlayerList(p3);
		addPlayerToPlayerList(p4);
		
		p1.setPlayerLocation(2);
		p2.setPlayerLocation(3);
		p3.setPlayerLocation(4);
		p4.setPlayerLocation(9);
	}

	/**
	 * In real game, land (super) array, includes areas, go, free parking?
	 */
	public static void setUpBoard() {
		Area a1 = new Area("Brown", "br1", 100, 50, 50);
		Area a2 = new Area("Brown", "br2", 100, 50, 50);
		Area a3 = new Area("Pink", "p1", 100, 50, 50);
		Area a4 = new Area("Pink", "p2", 100, 50, 50);
		Area a5 = new Area("Pink", "p3", 100, 50, 50);
		Area a6 = new Area("Red", "r1", 100, 50, 50);
		Area a7 = new Area("Red", "r2", 100, 50, 50);
		Area a8 = new Area("Red", "r3", 100, 50, 50);
		Area a9 = new Area("Blue", "b1", 100, 50, 50);
		Area a10 = new Area("Blue", "b2", 100, 50, 50);
		
		addAreaToBoard(a1);
		addAreaToBoard(a2);
		addAreaToBoard(a3);
		addAreaToBoard(a4);
		addAreaToBoard(a5);
		addAreaToBoard(a6);
		addAreaToBoard(a7);
		addAreaToBoard(a8);
		addAreaToBoard(a9);
		addAreaToBoard(a10);
		
	}
	
	public static void gamePlaying() { 
		//while (!gameFinished) {
			for (int playerTurn = 0; playerTurn < players.length; playerTurn++) {
				System.out.println("**Beginning Player: " + players[playerTurn].getName() + "'s turn...**");
				
				System.out.println("Current Location...");
				
				//Prints area details for where the player is
				System.out.println(gameBoard[players[playerTurn].getPlayerLocation()].displayAll() + "\n");
				
				
				areasWithinReach(players[playerTurn]);
				
				movePlayer(players[playerTurn]);
			}
		//}
	}
	
	public static void addAreaToBoard(Area area) {
		for (int loop = 0; loop < gameBoard.length; loop++) {
			if (gameBoard[loop] == null) {
				gameBoard[loop] = area;
				break;
			}
		}
	}
	
	public static void addPlayerToPlayerList(Player player) {
		for (int loop = 0; loop < players.length; loop++) {
			if (players[loop] == null) {
				players[loop] = player;
				break;
			}
		}
	}
	
	public static void areasWithinReach(Player player) {
		int spacesLeftAroundBoard = MAX_ROLL;
		
		System.out.println("Properties within reach...");
		
		for(int loop = 1; loop <= MAX_ROLL; loop++) {
			
			// Checks if this roll will progress the player past the end of the board
			if ((loop + (player.getPlayerLocation())) >= gameBoard.length) {
				
				//sets the number of spaces remaining around the board
				spacesLeftAroundBoard = (MAX_ROLL + 1) - loop;
				
				//will loop through remaining values of dice roll, incrementing loop (as it is counter for dice roll) preventing
				//re-entering parent loop once gone through remaining values on dice
				for(int innerLoop = 0; innerLoop < spacesLeftAroundBoard; innerLoop++) {
					System.out.println("Rolling " + loop++ + ": " + gameBoard[0 + innerLoop].displayAll());
				}
				
				//If roll won't put player around the board
			} else {
				System.out.println("Rolling " + loop + ": " + gameBoard[(player.getPlayerLocation()) + loop].displayAll());
			}
		}
	}
	
	public static void movePlayer(Player player) {
		System.out.println();
		int areaToMoveTo = (player.getPlayerLocation() + player.rollDice());
		
		if (areaToMoveTo >= gameBoard.length) {
			player.setPlayerLocation(areaToMoveTo - gameBoard.length);
		} else {
			player.setPlayerLocation(areaToMoveTo);
		}
		
		System.out.println("New location of " + player.getName() + ": " + gameBoard[player.getPlayerLocation()].displayAll());
	}
	
	
	
}
