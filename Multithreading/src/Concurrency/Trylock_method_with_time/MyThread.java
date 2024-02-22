package Concurrency.Trylock_method_with_time;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
	
	static ReentrantLock l=new ReentrantLock();
	
	public MyThread(String name)
	{
		super(name);
	}
	
	public void run()
	{
		do {
			try {
				if(l.tryLock(5000,TimeUnit.MILLISECONDS))
				{
					System.out.println(Thread.currentThread().getName()+" ===get lock");
					Thread.sleep(30000);
					l.unlock();
					
					System.out.println(Thread.currentThread().getName()+" ===release Lock");
					break;
				}
				else {
					System.out.println(Thread.currentThread().getName()+" ====unable to get the lock and will try again");
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}while(true);
	}
}
