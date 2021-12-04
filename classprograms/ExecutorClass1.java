package classprograms;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecutorClass1 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(new MyJob6());
		System.out.println("main thread called...");
		es.shutdown();
	}
}
class MyJob3 implements Runnable{
	@Override
	public void run() {
		System.out.println("child thread called...");
	}
}
