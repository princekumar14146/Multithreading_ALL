package interThreadCommunication;

public class Thread2 extends Thread{
	
	int total=0;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=1;i<=100;i++)
			{
				total=total+i;
			}
			System.out.println("Child giving notification call");
			this.notify();
		}
	
	}

}
