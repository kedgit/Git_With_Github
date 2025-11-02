package Collection;

import java.util.Scanner;

public class Queue_using_Array {

	int Queue[];
	int front=0,rear=0;
	
	public Queue_using_Array(int size) {
		
		Queue = new int[size];
	}
	
	void enqueue(int data) {
		if(rear==Queue.length) {
			System.out.println("Queue is OverFlow !");
			return;
		}
		Queue[rear]=data;
		System.out.println("push data into queue is: "+Queue[rear++]);
	}
	void dequeue() {
		if(front==rear) {
			System.out.println("Queue is UnderFlow !");
			return;
		}
		System.out.println("Popped data is: "+Queue[front++]);
	}
	
	void display() {
		if(front>=rear) {
			System.out.println(" No");
		}
		while(front<rear) {
			System.out.println(+Queue[front++]);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Hey User Enter Queue Size: ");
		int size=sc.nextInt();
		Queue_using_Array queue=new Queue_using_Array(size);
		queue.enqueue(11);
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(14);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		System.out.print("Remain Queue Elements are : ");
		queue.display();
	}

}
