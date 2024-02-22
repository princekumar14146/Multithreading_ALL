package synchronized_block;

public class Display {
	
	
	public void wish(String name)
	{
		// lets assume here 1 lakh lines of code is there 
		synchronized (this) {
			for(int i=0;i<10;i++)
			{
				System.out.print("Good MOrning :");
				try {
					  Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
		}
		
		
		// lets assume here 1 lakh lines of code is available
	}

}
