package HashMapExample;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx4 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> l= new LinkedHashMap<Integer, String>();
		l.put(1, "sudip");
		l.put(2, "abc");
		l.put(3, "mno");
		l.put(4, "gef");
		
		// to get the keys
		System.out.println("keys only:");
		Set<Integer> keys = l.keySet();
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\nnames only:");
		Collection<String> names = l.values();
		for(String name:names) {
			System.out.print(name+" ");
		}
		System.out.println("\n");
		Set<Entry<Integer, String>> entry = l.entrySet();
		Iterator<Entry<Integer, String>> i = entry.iterator();
		while(i.hasNext()) {
			Entry<Integer, String> pair = (Entry<Integer, String>)i.next();
			System.out.println("the key is: "+pair.getKey()+" and the value is: "+pair.getValue());
		}
		

	}

}
