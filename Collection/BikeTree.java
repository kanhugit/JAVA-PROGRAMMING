package Collection;

public class BikeTree implements Comparable<BikeTree>{
	String brand,color;
	double cost;
	double milage;
	double topspeed;
	public BikeTree(String brand, String color, double cost, double milage, double topspeed) {
		this.brand = brand;
		this.color = color;
		this.cost = cost;
		this.milage = milage;
		this.topspeed = topspeed;
	}
	@Override
	public String toString() {
		return "\nBikeTree [brand=" + brand + ", color=" + color + ", cost=" + cost + ", milage=" + milage + ", topspeed="
				+ topspeed + "]";
	}
	
	public int compareTo(BikeTree o) {
		if(this.cost>o.cost) {
			return 1;
		}
		if(this.cost<o.cost) {
			return -1;
		}
		return 0;
	}
		
	
	

}
