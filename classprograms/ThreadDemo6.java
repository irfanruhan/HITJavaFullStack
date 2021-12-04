package classprograms;
//Optimistic Lock -> Method Locking

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadDemo6 {
	public static void main(String[] args) {
		CounsellingHall hall=new CounsellingHall();
		
		ExecutorService es=Executors.newFixedThreadPool(3);
		
		es.execute(new CounsellingJob(hall, "ram"));
		es.execute(new CounsellingJob(hall, "rahim"));
		es.execute(new CounsellingJob(hall,"ghaleb"));
		//es.shutdown();   --> Results are going crazy because of this
		
	}
}
class CounsellingJob implements Runnable{
	CounsellingHall hall;String name;
	public CounsellingJob(CounsellingHall hall,String name) {
		this.hall=hall;
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.currentThread().setName(name);
		if(name.equals("ghaleb")) {
			hall.waterPot();
			hall.checkCredentials();
			hall.doAdmission();
		}
		else {
			hall.checkCredentials();
			hall.doAdmission();
		}
	}
}
class CounsellingHall{
	synchronized public void checkCredentials() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Candidate "+name+" is doing the first work....");
		
	}
	synchronized public void doAdmission() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Candidate "+name+" is doing the second work....");
		System.out.println("taking time...");
		try {Thread.sleep(3000);}catch(Exception e) {}
		System.out.println("admission over..."+name);
		
		
	}
	
	public void waterPot() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is drinking water....");
	}
}