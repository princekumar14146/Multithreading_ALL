package Yeild_Join_Sleep_Method;

public class PreventExecution implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
			Thread.yield();
		}
		
	}
	
	

}