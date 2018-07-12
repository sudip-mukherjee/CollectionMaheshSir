
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone {

	int price;
	String brand;
	String color;
	double screenSize;
	
	public Phone(int price, String brand, String color, double screenSize) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "Phone [price=" + price + ", brand=" + brand + ", color=" + color + ", screenSize=" + screenSize + "]\n";
	}
	
public static void main(String[] args) {
	ArrayList<Phone> a=new ArrayList<Phone>();
	a.add(new Phone(1000,"sAMSUNG","BLACK",7.9) );
	a.add(new Phone(4400,"mi","pink",7.0) );
	a.add(new Phone(3300,"apple","grey",7.8) );
	a.add(new Phone(2200,"nokia","red",7.2) );
	System.out.println("before sorting");
	System.out.println(a);
	//.sort(a);
	Collections.sort(a,new PriceComparator());
	System.out.println("\n after sorting");
	System.out.println(a);
	
	
}
}
