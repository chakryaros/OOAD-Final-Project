
public class DoubleRoom extends Room {

	public DoubleRoom(String name, double price, int bedNum) {
		super(name, price, bedNum);	// Invoke superclass constructor
	}
	
	// These may be superfluous.
	public double getPrice() {
		return super.price;
	}

}
