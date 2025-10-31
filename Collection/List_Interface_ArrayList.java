package Collection;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
public class List_Interface_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
								// faster access //
		
	// Non generic Collection type (all type data collect)
		
	// features - 
		// 1. order maintain
		// 2. duplicate allow
		// 3. null allow
		// 4. not thread safe (non-sync)
		// 5. dynamic size
		// 6. indexd access (faster)
	
	// Avoid
		// 1. thread safe
		// 2. insertion in the middle
		List list=new ArrayList<>();
			list.add(15);
			list.add(16);
			list.add("17");
			list.add(null);
			System.out.println(list);
		
	// Generic Collection
		
		List<String> list1=new ArrayList<>();
			
			list1.add(null);
			// 1. add element
			list1.add("kedar");
			list1.add("ramesh");
			list1.add("shiva");
			list1.add("kedar");
			
			// 2. add at index
			list1.add(0, "ritesh");
			
			// 3. get - take index element
			System.out.println(list1.get(4));
			
			// 4. getfirst or last element
			System.out.println(list1.getFirst());
			System.out.println(list1.getLast());
			
			// 5. set - replace element at given index
			list1.set(1,"nitish");
			
			// 6. remove-index  - remove element from index
			list1.remove(1);
			
			// 7. indexOf(obj) - return first index of element if found
			System.out.println(list1.indexOf("kedar"));
			
			// 8. lastIndexOf(obj) - last index of obj
			System.out.println(list1.lastIndexOf("kedar"));
			
			// 7. remove(obj) - remove first occured element
			list1.remove("kedar");
			
			// 8.size() - lengyth of array list
			System.out.println(list1.size());
			
			// 9. contains - element is present
			System.out.println(list1.contains("kedar"));
			
			// 10. forech - perform action for all element
			list1.forEach(System.out::println);
			list1.forEach(name->System.out.println("Name:"+name));
			
			// 11. iterator - To travers an element (first u want create object of Iterator interface by help class and then use it.)
			Iterator<String> itr=list1.iterator(); // method in ArrayList class and it returns Itr obj which implement
				while(itr.hasNext()) {
					// current object return .next method
					String name=itr.next();
					System.out.println(name);
					if(name.equals("kedar"))
					{
						itr.remove();	
					}
					
				}
			
			// 12. ListItretor - to traverse forward and backword (only for list)
			
				ListIterator<String> bt=list1.listIterator(list1.size()); // size give for backword direction
				
				System.out.println("Backword direction !");
				
				while(bt.hasPrevious()) {
					String b=bt.previous();
					System.out.println(b);
				}
				
				
			System.out.println("After remove: "+list1);	
			// 10. isempty -
			System.out.println(list1.isEmpty());
			
			// 9.clear() - remove all element
			list1.clear();
			
			// 10. isEmpty() - check list is empty
			System.out.println(list1.isEmpty());
			System.out.println(list1);
			

	}

}
