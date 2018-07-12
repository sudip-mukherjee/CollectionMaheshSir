
public class Passport {
String passportNo;


public Passport(String passportNo) {
	super();
	this.passportNo = passportNo;
	System.out.println(this);
}


@Override
/*public String toString() {
	return "Passport [passportNo=" + passportNo + "]";
}*/


public int hashCode(){
	return this.passportNo.hashCode();
}
public static void main(String[] args) {
	Passport p1= new Passport("1234ABCFD");
	Passport p2= new Passport("XXX4899ABCFD");
	Passport p3= new Passport("1234ABCFD");
	Passport p4= new Passport("XYZ98777ABCFD");//CTRL ALT DOWN AND UP ARROWS
}
}
