package classprograms;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
public class ComparatorComparable {
	public static void main(String[] args) {
		Set empSet=new TreeSet(new MyComparator());
		
		empSet.add(new Employees(1, "rahim",20));
		empSet.add(new Employees(2, "ram",22));
		empSet.add(new Employees(3, "john",21));
		empSet.add(new Employees(4, "singh",24));
		
		System.out.println(empSet);
	}
}
class MyComparator implements Comparator<Employees>{
	@Override
	public int compare(Employees o1, Employees o2) {
		return o2.compareTo(o1);
	}
}
class Employees implements Comparable<Employees>{
	private int eno;
	private String ename;
	private int eage;
	public Employees(int eno, String ename, int eage) {
		this.eno = eno;
		this.ename = ename;
		this.eage = eage;
	}
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public int getEage() {
		return eage;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", eage=" + eage + "]\n";
	}
	@Override
	public int compareTo(Employees o) {
		// TODO Auto-generated method stub
		return this.eage-o.eage;
	}
}
