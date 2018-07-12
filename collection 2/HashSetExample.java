
public class HashSetExample {
	int id;
	String name;
	public HashSetExample(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashSetExample other = (HashSetExample) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	public static void main(String[] args) {
		HashSetExample h1 = new HashSetExample(1523, "sudip");
		HashSetExample h2 = new HashSetExample(1523, "abc");
		HashSetExample h3 = new HashSetExample(152, "def");
	}
	

}
