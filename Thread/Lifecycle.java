package threads;

// thread creation ways
// 1. by extending thread class
// 2. by implementing runnable interface

// steps to create thread
// 1. extends thread class
// 2. make object
// 3. override run() method
// 4. call start() method

// runnable interface require thread class

class firstthread extends Thread{
	
	// child thread
	
	public void run() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("thread is running !");
		
	}
}


public class Lifecycle {

	// main thread not stop execution during child sleep state
	// if u want stop forcefully then use join
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		// object create thread go to new State
		firstthread t=new firstthread();
		
		// check state before calling
		System.out.println("State of thread is: "+t.getState());
		
		// get thread priority
		System.out.println("priority of thread: "+t.getPriority());
		
		// check id of thread
		System.out.println("ID of Thread is: "+t.getId());
		
		// calling thread
		t.start();
		
		// check state after calling thread 
		System.out.println("State of thread is: "+t.getState());
		
		// check thread is running or not
		System.out.println("Check thread is Running: "+t.isAlive());
		
		//thread in waiting state
		System.out.println("State of thread is: "+t.getState());
		
		// check total threads
		System.out.println("Count of thread in process is: "+t.activeCount());
		// use join to wait until thread complete work
		try {
			t.join();
		}
		catch(InterruptedException e) 
		{
			System.out.println("Waiting for child thread Completes !");
		}
		System.out.println("State of thread is: "+t.getState());
		System.out.println("Check thread is Running : "+t.isAlive());
	}

}
