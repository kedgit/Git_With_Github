package Collection;

import java.util.Set;
import java.util.LinkedHashSet;
public class Set_Interface_LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// features
		// 1. order + unique
		// 2. one null allow
		// 3. slower due to linkedlist
		
		Set<Double> bill= new LinkedHashSet<>();
		
		bill.add(23.56);
		bill.add(86.00);
		bill.add(24.67);
		bill.add(12.98);
		bill.add(24.67);
		bill.add(null);
		bill.add(null);	
		
		System.out.println(bill);
		
	}

}
