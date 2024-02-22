package Concurrency.on_synchronized_using_ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
	ReentrantLock l=new ReentrantLock();
	public void wish(String name)
	{
		
		l.lock();
	  
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Morning :");
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(name);
		}
		l.unlock();
	}
	
}
