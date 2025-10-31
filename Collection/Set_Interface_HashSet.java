package Collection;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class Set_Interface_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// features
		// 1. unique element
		// 2. order not maintain
		// 3. use hashtable for storage
		// 4. slower access
		// 5. internaly use hasmap
		Set<Integer> set1 = new HashSet<>();
		
		// add element 
		set1.add(12);
		set1.add(11);
		set1.add(13);
		set1.add(21);
		
		// null store only one
		set1.add(null);
		
		// remove specific object
		set1.remove(11);
		
		// check element is present or not
		System.out.println("22 contains: "+set1.contains(22));
		
		System.out.println(set1);
		
		Set<Integer> set2=new HashSet<>();
		set2.add(21);
		set2.add(22);
		set2.add(23);
		set2.add(12);
		set2.add(13);
		set2.add(null);
		
		// add all elements of one set into another
		 set2.addAll(set1);
		 
		// remove all matching elements from set 
		 set2.removeAll(set1);
		
		 // retain matching elemnets
		set2.retainAll(set1);
		
		System.out.println(set2.containsAll(set1));
		System.out.println(set2);
		
		
		Set<String> set= new HashSet<>();
		set.add("java");
		set.add("python");
		set.add("js");
		set.add("solidity");
		
		//object before remove
		System.out.println(set);
		
		// not use new keyword for object creation bez iterator is interface.so by help of method provided by Interface Iterator and implemented by hashset class
		Iterator<String> itr= set.iterator();
		
		// traverse elements
		while(itr.hasNext()) {
			// current string contains
			String rm=itr.next();
			if(rm.equals("js")) {
				itr.remove();
			}
		}
		
		// set after remove object
		System.out.println("after object remove: "+ set);
	}

}
