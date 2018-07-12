import java.util.Collections;
import java.util.LinkedList;

public class Flight implements Comparable<Flight>{
	String flightNo;
	String name;
	int costPerTicket;
	int seatingCapacity;

	public Flight(String flightNo, String name,int costPerTicket, int seatingCapacity ) {
		super();
		this.flightNo = flightNo;
		this.name = name;
		this.costPerTicket = costPerTicket;
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public int compareTo(Flight f) {
		if(this.costPerTicket>f.costPerTicket)
			return 1;
		else if(this.costPerTicket<f.costPerTicket)
			return -1;
					
			else 
				return 0;
	}

	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", name=" + name + ", costPerTicket=" + costPerTicket
				+ ", seatingCapacity=" + seatingCapacity + "] \n";
	}

	public static void main(String[] args) {
		LinkedList<Flight> ls = new LinkedList<Flight>();
		ls.add(new Flight("MF2013", "indiGo", 2005, 50));
		ls.add(new Flight("SD1205", "Air india", 2600, 250));
		ls.add(new Flight("DF2015", "kingfisher", 2000, 260));
		
		Collections.sort(ls,new CostPerTicket());
		System.out.println(ls);
		
		
	
	}

}
