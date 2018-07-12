
import java.util.Comparator;

public class ScrrenSizeComparator implements Comparator<Phone> {

	@Override
	public int compare(Phone o1, Phone o2) {
		if(o1.screenSize > o2.screenSize)
			return 1;
		else if(o1.screenSize<o2.screenSize)
			return -1;
		else
		return 0;
	}

}
