package interrupt_another_thread_example1;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0;i<1000;i++)
		{
			System.out.println("Thread-"+i);
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
	}

}
