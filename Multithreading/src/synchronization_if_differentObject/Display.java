package synchronization_if_differentObject;

public class Display {
	// here if we have different object and each thread works on each object then on wish() even it is 
	// synchronized we got irregular output .
	
	/*
	 *    If we make our wish method as static synchronized then we got regular output
	 */
	public static synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Morning :");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
		
	}

}
