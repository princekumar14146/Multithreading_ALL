package Daemon_Thread;

public class Daemon extends Thread{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		Daemon d=new Daemon();
		d.setDaemon(true);
		d.start();
		System.out.println("Main Thread stop");
	}

}
