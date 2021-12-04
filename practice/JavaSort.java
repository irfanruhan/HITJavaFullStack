package practice;
import java.util.*;

class Check implements Comparator<Students>{
	@Override
	public int compare(Students o1, Students o2) {
		if(o1.getCgpa()>o2.getCgpa()) {
			return -1;
		}
		else if(o1.getCgpa()==o2.getCgpa()) {
			return o1.getFname().compareTo(o2.getFname());
		}
		else {
			return 1;
		}
	}
}

class Students{
	private int id;
	private String fname;
	private double cgpa;
	public Students(int id, String fname, double cgpa) {
		//super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class JavaSort
{
	public static void main(String[] args){
		System.out.println("Please enter the data");
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		ArrayList<Students> studentList = new ArrayList<Students>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Students st = new Students(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		Check c = new Check();
		Collections.sort(studentList,c);
      	for(Students st: studentList){
			System.out.println(st.getFname());
		}
	}
}
