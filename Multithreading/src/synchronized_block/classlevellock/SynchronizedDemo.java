package synchronized_block.classlevellock;

public final class SynchronizedDemo {

//	public static void main(String[] args) {
//		// example of Object level lock
//		// for single object regular output.
//		// if we got two object then both the Objetc is different hence we got irregular output. 
//		Display d1=new Display();
//		Display d2=new Display();
//		MyThread t1=new MyThread(d1,"Yuvraj");
//		MyThread t2=new MyThread(d2, "Sachin");
//		t1.start();
//		t2.start();
	
	private final int id;
	private final String email;
	
	public SynchronizedDemo(int id,String email)
	{
		this.id=id;
		this.email=email;
	}
	public int get()
	{
		return id;
	}
	public String get1()
	{
		return email;
	}
	

	

}
