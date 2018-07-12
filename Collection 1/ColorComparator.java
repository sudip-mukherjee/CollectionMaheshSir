
import java.util.Comparator;

public  class ColorComparator implements Comparator<Phone> {
	

	public int compare(Phone o1, Phone o2) {
		return o1.color.compareTo(o2.color);
		
	}
}