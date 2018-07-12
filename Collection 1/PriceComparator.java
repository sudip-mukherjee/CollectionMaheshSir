
import java.util.Comparator;

public class PriceComparator implements Comparator<Phone> {

	public int compare(Phone o1,Phone o2){
		if(o1.price>o2.price)
			return 1;
			else if(o1.price <o2.price)
				return -1;
			
				else 
					return 0;
			}
		

}

