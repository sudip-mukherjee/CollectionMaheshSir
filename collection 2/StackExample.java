import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Object> s = new Stack<>();
		s.push("a");
		System.out.println(s.search("a"));// 1
		System.out.println(s.search("N"));// -1
		
	}
}
