
import java.util.Comparator;

public class costPerTicketComparator implements Comparator<Flight> {

	@Override
	public int compare(Flight o1, Flight o2) {
		if(o1.costPerTicket>o2.costPerTicket)
			return 1;
			else if(o1.costPerTicket <o2.costPerTicket)
				return -1;
			
				else 
					return 0;
			}
	}


