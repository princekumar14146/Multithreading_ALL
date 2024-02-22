package Deadlock;

public class B {
	
	public synchronized void d2(A a)
	{
		System.out.println("Thread2 starts execution of d2() method");
//		try {
//			Thread.sleep(6000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		System.out.println("Thread2 trying to call A's last() method");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside B,last() method");
	}
}
