package HashMapExample;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String,Long> con = new HashMap<String,Long>();
		System.out.println(con.put("A", 987512345L));//null
		System.out.println(con.put("B", 987587451L)); //
		System.out.println(con.put("C", 128911569L));//
		System.out.println(con.put("D", 487951249L));//487951249 coz the next value is within the duplicate key
		System.out.println(con.put("D", 784578915L));//won't be added

		System.out.println(con);

		System.out.println(con.size());

		System.out.println(con.containsKey("A"));

	}
}
