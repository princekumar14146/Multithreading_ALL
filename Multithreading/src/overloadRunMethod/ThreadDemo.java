package overloadRunMethod;

public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread thread=new MyThread();
		thread.start();
		
		
		// as we start the thread and again trry to restart the thread then we got the runtime exception 
		// i.e 	iLLEGAL Threadstate exception.
		thread.start();
		
		thread.run(10);

	}

}
