package Executor_Thread_Pool;

import Daemon_Thread.MyThread;

public class PrintJob implements Runnable {
	
	String name;
	
	public PrintJob(String name)
	{
		this.name=name;
	}
	public void run()
	{
		System.out.println(name+"...job started by Thread: "+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(name+"...job completed by thread: "+Thread.currentThread().getName());
	}

}
