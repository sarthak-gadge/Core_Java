package Collection;

import java.util.Set;
import java.util.TreeSet;

// set :- type 2:- TreeSet.

public class TreeeSett {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet();
		
		set.add(45);
		set.add(86);
		set.add(23);
		set.add(75);
		set.add(50);
		set.add(40);
		
		System.out.println(set);
		
		System.out.println("size of set: "+set.size());
		
		System.out.println(set.remove(50));
		System.out.println(set);
		
		System.out.println(set.contains(20));
		
	    if(set.isEmpty()) {
	    	System.out.println("set is empty");
	    }
	    else {
	    	System.out.println("not empty");
	    }
		
		
	}

}
