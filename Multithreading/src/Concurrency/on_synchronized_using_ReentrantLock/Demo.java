package Concurrency.on_synchronized_using_ReentrantLock;

public class Demo {

	public static void main(String[] args) {
		
		Display d=new Display();
		MyThread t1=new MyThread(d,"DHONI");
		MyThread t2=new MyThread(d,"YUVRAJ");
		
		t1.start();
		t2.start();

	}

}
