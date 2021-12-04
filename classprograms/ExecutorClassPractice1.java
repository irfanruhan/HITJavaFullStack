package classprograms;

import java.util.concurrent.*;

public class ExecutorClassPractice1 {
	public static void main(String[] args)throws Exception {
		System.out.println("Thoko Thaali!");
		ExecutorService ee = Executors.newFixedThreadPool(1);
		Future f = ee.submit(new ThreadJob0());
		System.out.println(f.get());
		System.out.println("Waah Waah Waah");
		ee.shutdown();
	}
}

class ThreadJob0 implements Callable{

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return "Hahahahaaha";
	}
	
}