
import java.util.Comparator;

public class NameComparator implements Comparator<Flight> {

	@Override
	public int compare(Flight o1, Flight o2) {
		return o1.name.compareTo(o2.name);
	}

}
