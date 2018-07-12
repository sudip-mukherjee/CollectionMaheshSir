import java.util.HashSet;

public class Passport {
	String passportNo;

	public Passport(String passportNo) {
		this.passportNo = passportNo;
		System.out.println(this);
	}
	
	public int hashCode() {
		return this.passportNo.hashCode();
	}
	
	public static void main(String[] args) {
		Passport p1 = new Passport("1234");
		Passport p2 = new Passport("1234");
		Passport p3 = new Passport("1239");
		Passport p4 = new Passport("1234");
		Passport p5 = new Passport("1237");
		
		/*HashSet<Object> hashSet = new HashSet<>();
		hashSet.add(p1);
		hashSet.add(p2);
		hashSet.add(p3);
		hashSet.add(p4);
		hashSet.add(p5);
		syso*/
		
	}
	

}
