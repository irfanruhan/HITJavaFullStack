package classprograms;

public class ThreadDemo2 {
	public static void main(String[] args) throws Exception{
		Thread t=new Thread(new MyJob());
		t.start();
		//Thread.sleep(100);
	//	System.out.println("main thread running....");	
	//	for(int i=0;i<100000;i++) {
			//System.out.print(i+"\t");
	//	}
		while(true) {}
		//System.out.println("main thread...");
	}
}
class MyJob implements Runnable{
	public void run() {
		System.out.println("child thread called....");
	}
}
