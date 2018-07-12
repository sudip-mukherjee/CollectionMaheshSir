import java.util.LinkedHashSet;

public class Marker {

	String color;
	int price;

	// long phnNo;

	public int hashCode() {
		return this.price;

		/*
		 * Long l = this.phnNo; 
		 * return l.hashCode();
		 */
	}

	public boolean equals(Object o) {
		if (o instanceof Marker) {
			Marker m = (Marker) o;
			return this.color.equals(m.color);
			//return this.price==m.price;
		}
		return false;
	}

	public static void main(String[] args) {


	}

}
