package goodqn;
import java.util.*;

class Priorities{
	Scanner scan = new Scanner(System.in);
	public List<Student> getStudents(List<String> events) {
		PriorityQueue<Student> pq = new PriorityQueue<Student>();
		//String eventarray[] = new String[events.size()];
		for(String e:events) {
			if(e.equals("SERVED")) {
				//System.out.println("Its working!");
				pq.poll();
				continue;
				//System.out.println(pq.poll());
			}
			String s[] = new String[4];
			s = e.split("\\s");
			if(s.length>1) {
				String name = s[1];
				double cgpa = Double.valueOf(s[2]);
				int id = Integer.valueOf(s[3]);
				Student temp = new Student(id,name,cgpa);
				pq.add(temp);
			}
		}
		
		while(pq.size()>1) {
			System.out.println(pq.poll().name);
		}
		
		List<Student> l = new ArrayList<Student>(pq);
		return l;
	}
	
}

class Student implements Comparable<Student>{
	int id;
	String name;
	double cgpa;
	Student(int id,String name,double cgpa){
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
	}
	int getID(){
		return id;
	}
	String getName() {
		return name;
	}
	double getCGPA() {
		return cgpa;
	}
	
	@Override
	public int compareTo(Student o) {
		if(cgpa == o.cgpa) {
			if(name.equals(o.name)) {
				if(id == o.id) {
					return 0;
				}
				else if(id>o.id) {
					return -1;
				}
				else {
					return 1;
				}
			}
			else {
				return name.compareTo(o.name);
			}
		}
		else if(cgpa > o.cgpa) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	
	
}

public class PriorityListHR {
	private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
    	System.out.println("Please enter the events");
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
       /*for(String s:events) {
    	   System.out.println(s);
       }
       */ 
          if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
        
        
        
    }
}
