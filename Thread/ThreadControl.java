package threads;

class Control extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName()+" "+i);
		}
	}
}


public class ThreadControl {

	public static void main(String[] args) {

		
		Control f= new Control();
		Control s= new Control();
		Control t= new Control();
		
		f.setName("Thread-1");
		s.setName("Thread-2");
		t.setName("Thread-3");
		
		// use priority with help of static int variable of Thread class
		// we just give hint to scheduler but not guarunty to follow order
		
		// NOTE:
		
		// 1.Thread priority is a hint, not a rule. JVM and OS may ignore it.
		// 2.Use priorities carefully; don't rely on them for correctness. 
		// 3.Instead, for controlling execution, prefer synchronization (wait(), notify(), join(), etc.).
		
		f.setPriority(Thread.MAX_PRIORITY);
		s.setPriority(Thread.NORM_PRIORITY);
		t.setPriority(Thread.MIN_PRIORITY);
		
		f.start();
		s.start();
		t.start();

		
		
	}

}
