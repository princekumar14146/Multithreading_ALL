package join_method;

public class MyDriver {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread r=new MyThread();
		Thread t=new Thread(r);
		
		t.start();
		
		t.join(10000  );
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread ");
		}

	}

}
