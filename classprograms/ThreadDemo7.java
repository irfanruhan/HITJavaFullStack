package classprograms;
//Class Locking Demo

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo7 {
	public static void main(String[] args) {
		Counselling c = new Counselling();
		FeePayment f = new FeePayment();
		CertificatesDeposit cd = new CertificatesDeposit();
		
		ExecutorService e = Executors.newFixedThreadPool(5);
		
		e.execute(new AdmissionJob("Sam","SC",2000,1000,c,f,cd));
		e.execute(new AdmissionJob("Tom","General",800,10000,c,f,cd));
		e.execute(new AdmissionJob("Root","Sports",2000,1000,c,f,cd));
		e.execute(new AdmissionJob("Haseeb","General",800,10000,c,f,cd));
		e.execute(new AdmissionJob("Ben","ST",2000,1000,c,f,cd));
		e.shutdown();
	}
}

class AdmissionJob implements Runnable{
	int amount;
	int rank;
	String name;
	String caste;
	Counselling c;
	FeePayment f; 
	CertificatesDeposit cd;
	
	public AdmissionJob(String name,String caste,int rank,int amount,Counselling c,FeePayment f,CertificatesDeposit cd) {
		this.name = name;
		this.caste = caste;
		this.amount = amount;
		this.rank = rank;
		this.c = c;
		this.f = f;
		this.cd = cd;
	}
	
	@Override
	public void run() {
		synchronized(Counselling.class) {
			Thread.currentThread().setName(name);
			c.callall(name, caste, rank);
			f.callall(name, caste, amount);
			cd.callall(name);
		}
	}
	
}

class Counselling{
	static boolean check = false;
	void checkRank(String name,String caste,int rank) {
		if(caste.equals("General")) {
			if(rank<=800) {
				System.out.println("Rank OK for "+name);
				check = true;
			}
		}
		else {
			if(rank<=2000) {
				System.out.println("Rank OK for "+name);
				check = true;
			}
		}
	}
	
	void admit(String name) {
		if(check == true) {
			System.out.println(name + " admitted into XYZ College subject to fee payment");
		}
	}
	
	void callall(String name,String caste,int rank) {
		checkRank(name,caste,rank);
		admit(name);
	}
}

class FeePayment{
	static boolean paid = false;
	void payFee(String name,String caste,int amount) {
		if(caste.equals("General")) {
			amount = amount - 8000;
			if(amount>0) {
				paid = true;
			}
		}
		else {
			amount  = amount - 800;
			if(amount>0) {
				paid = true;
			}
		}
	}
	void getReceipt(String name) {
		if(paid == true) {
			System.out.println(name+"'s Fee Paid");
		}
	}
	void callall(String name,String caste,int amount) {
		payFee(name,caste,amount);
		getReceipt(name);
	}
}

class CertificatesDeposit{
	void deposit(String name) {
		System.out.println(name+" certificates deposited"+"\n");
	}
	void callall(String name) {
		deposit(name);
	}
}

