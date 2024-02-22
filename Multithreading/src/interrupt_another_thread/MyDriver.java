package interrupt_another_thread;

public class MyDriver {

	public static void main(String[] args) {
		
		MyThread r=new MyThread();
		r.start();
		
		r.interrupt();
		System.out.println("End of main");

	}

}
