package synchronization;

public class SynchronizedDemo {

	public static void main(String[] args) {
		
		Display d1=new Display();
		//Display d2=new Display();
		
		MyThread t1=new MyThread(d1,"Dhoni");
		MyThread t2=new MyThread(d1, "Yuvraj");
		MyThread t3=new MyThread(d1, "Kohli");
		t1.start();
		t2.start();
		t3.start();  
	}

}
