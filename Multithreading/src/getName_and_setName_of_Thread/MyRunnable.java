package getName_and_setName_of_Thread;

public class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
		
	}

}
