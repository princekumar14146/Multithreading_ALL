package getName_and_setName_of_Thread;

public class Test {

	public static void main(String[] args) {
		
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
        t.start();
        
        System.out.println("The name of the thread that executes the main method is :"+Thread.currentThread().getName());
        System.out.println("The name of the thread that executes the MyRunnable thread is :"+t.getName());
        
        // if we want to change the name of the thread i.e main thread and created thread then
        Thread.currentThread().setName("Prince");
        System.out.println("The name of the main thread is :"+Thread.currentThread().getName());
        
        t.setName("sakshi");
        System.out.println("The name of the My runnable thread is :"+t.getName());
	}

}
