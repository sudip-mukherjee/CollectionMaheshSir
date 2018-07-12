
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Flight implements Comparable<Flight>{
int flightNo;
String name;
double costPerTicket;
int seatingCapacity;


public Flight(int flightNo, String name, int costPerTicket, int seatingCapacity) {
	super();
	this.flightNo = flightNo;
	this.name = name;
	this.costPerTicket = costPerTicket;
	this.seatingCapacity = seatingCapacity;
}

@Override
public String toString() {
	return "Flight [flightNo=" + flightNo + ", name=" + name + ", costPerTicket=" + costPerTicket + ", seatingCapacity="
			+ seatingCapacity + "]\n";
}


public int compareTo(Flight o){
	if(this.costPerTicket>o.costPerTicket)

return 1;
else if (this.costPerTicket<o.costPerTicket)
	return -1;
else return 0;
}


public static void main(String[] args) {
	LinkedList<Flight>flights = new LinkedList<Flight>();
	flights.add(new Flight(488, "KingFisher",78000, 290));
	flights.add(new Flight(230, "indigo", 43000, 900));
	flights.add(new Flight(320, "jetairways", 89000, 123));
	System.out.println("before sorting");
	System.out.println(flights);
	//.sort(a);
	Collections.sort(flights,new costPerTicketComparator());
	System.out.println("\n after sorting");
	//System.out.println(flights);
	Iterator<Flight> itr =flights.iterator();
	while(itr.hasNext()){
		Flight f=(Flight)itr.next();
		System.out.println(f);
	}
	
}
}