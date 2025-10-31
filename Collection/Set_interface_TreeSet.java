package Collection;

//import java.util.Set;
import java.util.TreeSet;
public class Set_interface_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// unique + sorted order + not null
		
		TreeSet<Float> CGP=new TreeSet<>();
		CGP.add((float) 6.5);
		CGP.add((float) 7.8);
		CGP.add((float) 0.6);
		CGP.add((float) 8.7);
		CGP.add((float) 6.52);
		
		// null not allow
		// CGP.add(null);
		
		// return same or next smaller
		System.out.println(CGP.floor((float) 7.4));
		
		// return same or next greater
		System.out.println(CGP.ceiling((float) 6.3));
		
		// return first and last element
		System.out.println(CGP.first());
		System.out.println(CGP.last());
		
		// next one greater element
		System.out.println(CGP.higher((float) 6.5));
		
		// previous one smaller element
		System.out.println(CGP.lower((float) 7.8));
		
		// subset element not last one
		
		System.out.println(CGP.subSet((float) 0.6, (float) 8.7));
		
		// retrive and remove first and last element
		System.out.println(CGP.pollFirst());
		System.out.println(CGP.pollLast());
		
		// reverse order
		System.out.println(CGP.descendingSet());
		
		System.out.println(CGP);
		
	}

}
