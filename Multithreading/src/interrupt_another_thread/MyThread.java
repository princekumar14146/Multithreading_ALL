package interrupt_another_thread;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		
		try {
		for(int i=0;i<10;i++)
		{
			System.out.println("my name is prince kumar");
				//Thread.sleep(2000);
			
		}
		} catch (Exception e) {
			System.out.println("I got interrupted");
		}
	}

}
