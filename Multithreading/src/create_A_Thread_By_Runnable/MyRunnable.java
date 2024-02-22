package create_A_Thread_By_Runnable;

public class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread");
		}
		
	}

}
