package HashMapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HahsMapEx2 {
	public static void main(String[] args) {
		HashMap<String,Long> con = new HashMap<String,Long>();
		con.put("A", 987512345L);
		con.put("B", 987587451L); 
		con.put("C", 128911569L);
		con.put("D", 487951249L);
		con.put("D", 784578915L);
		Set<String> keys = con.keySet();
		
		//using iterator
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		//using for each
		for(String x:keys) {
			System.out.print(x+" ");
		}
		
		
	}

}
