package Collection;

import java.util.List;
import java.util.LinkedList;
public class List_Interface_Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// second class implement list interface i.e Linkedlist
		
						// faster modification //
		// features
		// 1. slow (must traverse nodes)
		// 2. insertion fast
		// 3. memory high use due to pointer
		// 4. not random access supports
		LinkedList<Double> ll=new LinkedList<>();
		
		// add element
		ll.add(3.4);
		ll.add(4.5);
		ll.add(4.5);
		
		// add element at head position
		ll.addFirst(9.6);
		
		// add at index 
		ll.add(0, null);
		
		// at at the end
		ll.offer(4.1);
		ll.offerLast(7.0);
		ll.addLast(8.3);
		
		// add at start
		ll.offerFirst(6.9);
		
		// remove first element
		ll.remove();
		ll.removeFirst();
		ll.pollFirst();
		
		// remove from index
		ll.remove(3);
		
		// remove last element		
		ll.pollLast();
		ll.removeLast();
		
		// remove last occured element
		ll.removeLastOccurrence(4.5);
		
		// retrive and remove head element
		//System.out.println(ll.poll());
		
		// throws exception if empty list
		// get first element
		System.out.println(ll.getFirst());
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		
		// get last element
		System.out.println(ll.getLast());
		System.out.println(ll.peekLast());
		
		// get indexed element
		System.out.println(ll.get(1));
		
		
		
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);

	}

}
