package Concurrency.tryLock_method;

public class ReetrantLockDemo3 {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread("First Thread");
		MyThread t2=new MyThread("Second Thread");
		t1.start();
		t2.start();

	}

}
