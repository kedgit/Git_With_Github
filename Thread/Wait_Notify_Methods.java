package threads;


class Bankbalance extends Thread{
	
	private int balance=0;
	
	// synchronized to current thread owns the object lock and then only thread can call wait, notify and notifyall 
	synchronized void debit(int amount) {
		 System.out.println(" Wait for balance updatation !");
		 
		 while(balance<amount) {
			 System.out.println("Insuffiecient balance or wait for creadit method notify !");
			 
			 try {
				 // when wait method call by thread then it release object lock and go into object waitlist
				 // wait for notify by other thread of object and take lock to continue execution
				 
				 		wait();      
				 		
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			balance-=amount;
			System.out.println(amount+" Debiated Successfuly !");
			System.out.println("Reamaining balance in your account is: "+balance);
		 }
	 }
	
	synchronized void auto() {
		try {
			wait();
			System.out.println("Hello kedar mhetre !");
		}
		catch(InterruptedException e) {
			
		}
		
	}
	 
	synchronized void credit(int amount) {
		 System.out.println("Your Account creadited: "+amount+" Rupees !");
		 balance+=amount;
		 System.out.println("Account balance is: "+ balance);
		 
		 notifyAll();
	 }
	
}

public class Wait_Notify_Methods {

	public static void main(String[] args) throws InterruptedException {
	
		Bankbalance b=new Bankbalance();
		// Error
		//  java.lang.IllegalMonitorStateException: current thread is not owner
	
		// b.debit(1000);
		// b.credit(2000);
		
		// make object of thread claa and then call method as lambda function
		
		new Thread(() -> b.debit(1000),"DebitThread").start();
		
		// small delay in both transaction to prevent data inconsisteny by sleep()
		
		try {
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		
		// second wait thread
		
		new Thread(()-> b.auto(),"auto").start();
		
		
		try {
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		
		new Thread(() -> b.credit(2000),"CreaditThread").start();
		
		b.join();
		
		System.out.println("Both Transaction are done !");

	}

}
