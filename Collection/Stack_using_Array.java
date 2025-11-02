package Collection;

import java.util.Scanner;

public class Stack_using_Array {

	int Stack[];
	int top=-1;
	
	public Stack_using_Array(int size){
		Stack=new int[size];
	}
	
	void push(int number) throws Exception {
		if(top>=Stack.length-1) {
			// System.out.println("Stack OverFlow !");
			throw new Exception ("Stack size overflow");
			//return;
		}
		
		
		// top+=1;
		Stack[++top]=number;
		System.out.println("element push into at index"+ top+"stack i.e " + number);
	}
	
	void pop() {
		
		if(top<=-1) {
			System.out.println("Stack UnderFlow !");
		}
		
		System.out.println("Top element pop from stack i.e  "+Stack[top--]);
		// top-=1;
	}
	
	void display(){
		while(top>-1) {
			System.out.println(Stack[top--]);
			//top-=1;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Hey User Enter Stack Size: ");
		int size=sc.nextInt();
		Stack_using_Array stack=new Stack_using_Array(size);
		try {
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
		stack.pop();
		stack.pop();
		System.out.println("Stack remain Elements !");
		stack.display();
		
		

	}

}
