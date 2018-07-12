
import java.util.Comparator;

public class FlightNoComparator implements Comparator<Flight> {

	@Override
	public int compare(Flight o1, Flight o2) {
		if(o1.flightNo>o2.flightNo)
			return 1;
			else if(o1.flightNo <o2.flightNo)
				return -1;
			
				else 
					return 0;
			}
	}


