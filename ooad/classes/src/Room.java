
public abstract class Room {
	protected String name;
	protected double price;
	protected int bedNum;
	protected String roomDescription;
	
	// Explicit Constructor
	public Room(String name, double price, int bedNum) {
		this.price = price;
		this.roomDescription = name + bedNum;
	}
	
	// Default Constructor
	public Room() {
		this.price = 0;
		this.roomDescription = "None";
	}
	
	public String showRoom() {
		return roomDescription;
	}
	
	/*public String getName() {
		return this.name;
	}*/
	
	public abstract double getPrice();
	
	/*public int getBedNum() {
		return this.bedNum;
	}*/
}
