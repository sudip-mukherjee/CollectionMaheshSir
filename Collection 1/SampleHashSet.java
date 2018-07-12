
import java.util.HashSet;

public class SampleHashSet {
public static void main(String[] args) {
	HashSet h= new HashSet();
	h.add(1);
	h.add(1);
	h.add("X");
	h.add("Y");
	h.add("X");
	h.add(2);
	h.add(3);
	h.add(4);
	h.add(null);
	h.add(null);
	System.out.println(h);
}
}
