
import java.util.Comparator;

public class BrandComparator implements Comparator<Phone> {

	@Override
	public int compare(Phone o1, Phone o2) {
		
	return o1.brand.compareTo(o2.brand);
	}

	
}
