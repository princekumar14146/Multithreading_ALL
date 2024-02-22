package threadCheck_which_thread;

import javax.swing.text.StyledEditorKit.AlignmentAction;

public class Test {

	public static void main(String[] args) {
		
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
		System.out.println("This test gets executed by thread name :"+Thread.currentThread().getName());
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
	}

}
