package technopoly;

import java.util.ArrayList;

public class Player {
	
	private String name;
	private int money;
	private ArrayList<Area> ownedAreas = new ArrayList<Area>();
	private int playerLocation;
	
	public Player() {
		
	}

	/**
	 * @param name
	 * @param money
	 */
	public Player(String name, int money) {
		this.name = name;
		this.money = money;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the money
	 */
	public int getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(int money) {
		this.money = money;
	}

	/**
	 * @return the ownedAreas
	 */
	public ArrayList<Area> getOwnedAreas() {
		return ownedAreas;
	}

	/**
	 * @param ownedAreas the ownedAreas to set
	 */
	public void setOwnedAreas(ArrayList<Area> ownedAreas) {
		this.ownedAreas = ownedAreas;
	}
	
	public String displayAllAssets() {
		return this.name + ", Money: " + this.money + "\n Areas Owned: " + 
				this.ownedAreas;
	}
	
	/**
	 * Example roll dice method, each die having 4 sides in this instance
	 * @return
	 */
	public int rollDice() {
		int die1 = (int) (Math.random() * 3 + 1);
		int die2 = (int) (Math.random() * 3 + 1);
		int total = die1 + die2;
		
		System.out.println("Player: " + this.name + " rolled " + die1 + " + " + die2 + " = " + total);
		
		return total;
	}

	/**
	 * @return the playerLocation
	 */
	public int getPlayerLocation() {
		return playerLocation;
	}

	/**
	 * @param playerLocation the playerLocation to set
	 */
	public void setPlayerLocation(int playerLocation) {
		this.playerLocation = playerLocation;
	}
	
}
