
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayInteger {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(8);
		Collections.sort(a);
		System.out.println(a);
		Collections.sort(a,Collections.reverseOrder());
		System.out.println(a);
		for (Integer i:a) {        //foreach ctrl space enter 
			System.out.println(i);
		}
		Iterator<Integer> itr = a.iterator();
		while(itr.hasNext()){
			//System.out.println(itr.next());
			Integer i =(Integer) itr.next();
			System.out.println(i);
			
		}
		ListIterator<Integer> ltr =a.listIterator();
		System.out.println("printing in forward direction");
		while(ltr.hasNext()){
			System.out.println(ltr.next());
		}
		
		System.out.println("printing in reverse direction");
		while(ltr.hasPrevious()){
			System.out.println(ltr.previous());
			//ltr.add("_");
			//System.out.println(ltr.previous());
		}
		}
		
	}



