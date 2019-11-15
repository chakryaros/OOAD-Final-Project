
public class DeluxRoom extends Room {

	public DeluxRoom(String name, double price, int bedNum) {
		super(name, price, bedNum);
	}
	
	// These may be superfluous
	public double getPrice() {
		return super.price;
	}
	
	/*
	public String getName() {
		return super.name;
	}
		
	public int getBedNum() {
		return super.bedNum;
	}
	*/
}
