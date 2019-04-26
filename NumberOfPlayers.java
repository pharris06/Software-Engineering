package technopoly;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfPlayers {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter number of players between 2 and 4");
		String text = input.nextLine();
		
		switch(text) {
		case "2":
			System.out.println("2 players selected!");
			twoPlayers();
			break;
			
		case "3":
			System.out.println("3 players selected!");
			threePlayers();
			break;
			
		case "4":
			System.out.println("4 players selected!");
			fourPlayers();
			break;
			
		default:
			System.out.println("Incorrect number of players");
			
			input.close();
		}
		
		
	}
	
	public static void twoPlayers() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter player 1");
		Player player1 = new Player();
		String player1name = input.nextLine();
		player1.setName(player1name);
		
		
		System.out.println("Enter player 2");
		Player player2 = new Player();
		String player2name = input.nextLine();
		player2.setName(player2name);
		
		ArrayList<String> players = new ArrayList<String>();
		players.add(player1.getName());
		players.add(player2.getName());
		System.out.println("Player names: "+players.toString());
		
		input.close();
		
	}
	
	public static void threePlayers() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter player 1");
		Player player1 = new Player();
		String player1name = input.nextLine();
		player1.setName(player1name);
		
		System.out.println("Enter player 2");
		Player player2 = new Player();
		String player2name = input.nextLine();
		player2.setName(player2name);
		
		System.out.println("Enter player 3");
		Player player3 = new Player();
		String player3name = input.nextLine();
		player2.setName(player3name);
		
		ArrayList<String> players = new ArrayList<String>();
		players.add(player1.getName());
		players.add(player2.getName());
		players.add(player3.getName());
		
		System.out.println("Player names: "+players.toString());
		
		input.close();
	}
	
	public static void fourPlayers() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter player 1");
		Player player1 = new Player();
		String player1name = input.nextLine();
		player1.setName(player1name);
		
		System.out.println("Enter player 2");
		Player player2 = new Player();
		String player2name = input.nextLine();
		player2.setName(player2name);
		
		System.out.println("Enter player 3");
		Player player3 = new Player();
		String player3name = input.nextLine();
		player2.setName(player3name);
		
		System.out.println("Enter player 4");
		Player player4 = new Player();
		String player4name = input.nextLine();
		player2.setName(player4name);
		
		ArrayList<String> players = new ArrayList<String>();
		players.add(player1.getName());
		players.add(player2.getName());
		players.add(player3.getName());
		players.add(player4.getName());
		
		System.out.println("Player names: "+players.toString());
		
		
		input.close();
	}
	
}