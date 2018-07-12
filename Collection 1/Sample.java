
import java.util.Stack;

public class Sample {
public static void main(String[] args) {
	Stack<String> s= new Stack<String>();
	s.push("A");
	s.push("B");
	s.push("C");
	s.push("D");
	s.push("E");
	System.out.println(s.search("X"));
}
}
