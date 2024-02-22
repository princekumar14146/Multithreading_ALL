package join_method_DeadLock;

public class MyMain {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.currentThread().join();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("my name is prince kumar");
		}

	}

}
