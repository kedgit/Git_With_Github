package threads;

class mythread implements Runnable{

	@Override
	public void run() 
	{	
		System.out.println("Runnable interface implemnet");	
	}

}

public class ImplementedThread {

	public static void main(String[] args) throws InterruptedException {
		
		mythread it=new mythread(); 	 // interface has not start method 
		Thread n=new Thread(it);     	// use thread and pass interface class ref to thread object
		n.start();                   	// call run method
		n.join();    				 	 // wait intil child thread completely done
		System.out.println("Main Done ");
	}

}
