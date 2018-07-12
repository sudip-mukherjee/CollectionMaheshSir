
import java.util.Comparator;

public class SeatingCapacityComparator implements Comparator<Flight> {

	@Override
	public int compare(Flight o1, Flight o2) {
		if(o1.seatingCapacity>o2.seatingCapacity)
			return 1;
			else if(o1.seatingCapacity <o2.seatingCapacity)
				return -1;
			
				else 
					return 0;
			}
	}


