import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(Collections.reverseOrder());
		t.add("A");
		t.add("C");
		t.add("F");
		//t.add(4);
		//t.add(null);
		System.out.println(t);
	}

}
