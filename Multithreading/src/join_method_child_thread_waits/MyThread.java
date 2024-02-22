package join_method_child_thread_waits;

public class MyThread extends Thread{
	
	static Thread mt;
	@Override
	public void run() {
		
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
		
	}

}
