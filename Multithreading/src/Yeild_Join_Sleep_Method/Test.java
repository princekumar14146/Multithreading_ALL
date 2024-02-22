package Yeild_Join_Sleep_Method;

public class Test {

	public static void main(String[] args) {
		
		PreventExecution p=new PreventExecution();
		Thread t=new Thread(p);
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
			
		}

	}

}
