
import java.util.HashSet;

public class Student1 {
int id;
String name;

public Student1(int id, String name) {
	super();
	this.id = id;
	this.name = name;
	System.out.println(this);
}

/*@Override
public String toString() {
	return "Student1 [id=" + id + ", name=" + name + "]";
}*/


public int hasCode(){
	return this.id;
	
}
public static void main(String[] args) {
Student1 s1= new Student1(1111,"leo")	;
Student1 s2= new Student1(1333,"Mark");
Student1 s3= new Student1(11343212,"Mark");
Student1 s4= new Student1(1111,"leo")	;
HashSet<Student1> h = new HashSet<Student1>();
h.add(s1);
h.add(s2);
h.add(s3);
System.out.println(h);
}



}
