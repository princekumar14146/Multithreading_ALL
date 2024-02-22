package Deadlock;

public class A {
	
	public synchronized void d1(B b)
	{
		System.out.println("Thread1 starts edecution of d1() method");
//		try {
//			Thread.sleep(6000);
//		}
//		catch (Exception e) {}
			System.out.println("Thread1 trying to call B's last method");
			b.last();
		
	}
	public synchronized void last()
	{
		System.out.println("Inside A,last() method");
	}

}
