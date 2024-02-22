package join_method_child_thread_waits;

public class MyDriver {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread.mt=Thread.currentThread();
		
		MyThread t=new MyThread();
		t.start();
		t.join(); // here main threads wait for child thread and child thread waits for main thread for completing its execution hence deadlock situation occurs.
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
			Thread.sleep(2000);
		}

	}

}
