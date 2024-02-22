package get_and_set_priorities;

public class Test {

	public static void main(String[] args) {
		
		
		
		System.out.println("The priorities of earlier main thread is :"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println("The priorities of current  main thread is :"+Thread.currentThread().getPriority());
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		System.out.println("The priorities of THread-0 is :"+t.getPriority());
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
		// get default priorities set by jvm 
	
        
        
        // set priorities as per our requirement
        
        
	}

}
