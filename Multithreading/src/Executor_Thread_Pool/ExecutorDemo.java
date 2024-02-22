package Executor_Thread_Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		
		PrintJob[] job= {new PrintJob("prince"),
				         new PrintJob("piyush"),
				         new PrintJob("sakshi"),
				         new PrintJob("swati"),
				         new PrintJob("manoj"),
				         new PrintJob("nibha")
		};
		
		ExecutorService service=Executors.newFixedThreadPool(2);
		for(PrintJob jobs: job)
		{
			service.submit(jobs);
		}
		service.shutdown();

	}

}
