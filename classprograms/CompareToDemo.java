package classprograms;

import java.util.*;

public class CompareToDemo {
	public static void main(String[] args) {
		List list = new LinkedList();
		list.add(new students(1,"Tommy"));
		list.add(new students(2,"Tom"));
		list.add(new students(3,"Sam"));
		Collections.sort(list);
		System.out.println(list.toString());
	}
}

class students implements Comparable{
	int id;
	String name;
	students(int id,String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		students s = (students)o;
		return this.name.compareTo(s.name);
	}
	@Override
	public String toString() {
		return "students [id=" + id + ", name=" + name + "]";
	}
	
}
