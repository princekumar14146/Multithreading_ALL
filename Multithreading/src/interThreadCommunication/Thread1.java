package interThreadCommunication;

public class Thread1 {
	
	public static void main(String[] args) throws InterruptedException  {
		
		Thread2 b=new Thread2();
		b.start();
		synchronized (b) {
			System.out.println("Main thread calling wait method");
			b.wait();
			System.out.println("Main THread got Notification");
			System.out.println(b.total );
		}
 //		Thread.sleep(2000);
//		b.join();
		
		
		
		
	}
	

}
