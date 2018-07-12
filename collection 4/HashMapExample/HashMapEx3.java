package HashMapExample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class HashMapEx3 {
	public static void main(String[] args) {
		HashMap<String,Long> con = new HashMap<String,Long>();
		con.put("A", 987512345L);
		con.put("B", 987587451L); 
		con.put("C", 128911569L);
		con.put("D", 487951249L);
		con.put("D", 784578915L);
		
		//con.values() will return a collection and we can store it in any collection type
		
		TreeSet<Long> number = new TreeSet(con.values());//sorted values will be in stored order
		System.out.println("for each");
		for(Long l:number) {
			System.out.print(l+" ");
		}
		System.out.println();
		System.out.println("iterator");
		Iterator<Long> i = number.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}
}
