package synchronized_block;

public class SynchronizedDemo {

	public static void main(String[] args) {
		// example of Object level lock
		// for single object regular output.
		// if we got two object then both the Objetc is different hence we got irregular output. 
		Display d1=new Display();
		Display d2=new Display();
		MyThread t1=new MyThread(d1,"Yuvraj");
		MyThread t2=new MyThread(d2, "Sachin");
		t1.start();
		t2.start();

	}

}
