package multi_threading;

public class JavaApp {
	public static void execution() {
//		MyThread1 mt1 = new MyThread1();
//		mt1.start();    
		
		MyThread2 mt2 = new MyThread2();
		Thread thread = new Thread(mt2);
		thread.start();
		
	}
}

