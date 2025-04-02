package Collection;
//linked with ShowRoom
public class Bike {
	String brand;
	double cost;
	String color;
	double milage;
	public Bike(String brand, double cost, String color, double milage) {
		this.brand = brand;
		this.cost = cost;
		this.color = color;
		this.milage = milage;
	}
	public String toString() {
		return "\nBike [brand=" + brand + ", cost=" + cost + ", color=" + color + ", milage=" + milage + "]";
	}

	
}
