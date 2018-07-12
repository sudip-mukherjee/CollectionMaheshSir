
import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
String name;
int id;
double height;
	
	public Student(String name, int id, double height) {
		super();
		this.name = name;
		this.id = id;
		this.height = height;
	}
	
@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", height=" + height + "]\n";
	}

public static void main(String[] args) {
	Student s1= new Student("bidya",17,7.19);
	Student s2= new Student("sita",12,7.11);
	Student s3= new Student("geetha",11,7.12);
	ArrayList<Student> a = new ArrayList<Student>();
	a.add(s1);
	a.add(s2);
	a.add(s3);
	System.out.println(a);
	////Collections.sort(a);
	//System.out.println(a);
	Collections.sort(a, Collections.reverseOrder());
	System.out.println(a);
	for(Student s:a){
		System.out.println(s);
	}
}

@Override
/*public int compareTo(Student o) {
	if(this.height>o.height)
	return 1;
	else if(this.height<o.height)
		return -1
		;
	else
		return 0;
}*/

public int compareTo(Student o){
	return this.name.compareTo(o.name);
}

	
}

