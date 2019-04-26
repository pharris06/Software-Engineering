package technopoly;

public class Area {

	private String field;
	private String areaName;
	private int price;
	private int housePrice;
	private int baseRent;
	private boolean purchased;
	
	public Area() {
		
	}

	/**
	 * @param field
	 * @param areaName
	 * @param price
	 * @param housePrice
	 * @param baseRent
	 */
	public Area(String field, String areaName, int price, int housePrice, int baseRent) {
		this.field = field;
		this.areaName = areaName;
		this.price = price;
		this.housePrice = housePrice;
		this.baseRent = baseRent;
	}

	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}

	/**
	 * @param field the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}

	/**
	 * @return the areaName
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * @param areaName the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the housePrice
	 */
	public int getHousePrice() {
		return housePrice;
	}

	/**
	 * @param housePrice the housePrice to set
	 */
	public void setHousePrice(int housePrice) {
		this.housePrice = housePrice;
	}

	/**
	 * @return the baseRent
	 */
	public int getBaseRent() {
		return baseRent;
	}

	/**
	 * @param baseRent the baseRent to set
	 */
	public void setBaseRent(int baseRent) {
		this.baseRent = baseRent;
	}
	
	
	public String displayAll() {
		return this.areaName;
	}

	public boolean isPurchased() {
		return purchased;
	}

	public void setPurchased(boolean purchased) {
		this.purchased = purchased;
	}
	
	
}
