
public class SingleRoom extends Room {

	public SingleRoom(String name, double price, int bedNum) {
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
