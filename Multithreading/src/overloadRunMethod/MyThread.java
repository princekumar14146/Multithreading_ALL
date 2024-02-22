package overloadRunMethod;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("NO ARGS RUN");
	}
	
	public void run(int i)
	{
		System.out.println("int Arg run");
	}

}
