package Collection;

import java.util.HashSet;

//set :- type 1:- HashSet.

public class HashhSett {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(40);
		hs.add(52);
		hs.add(20);
		hs.add(78);
		hs.add(35);
		hs.add(25);
		
		System.out.println(hs);
		
		System.out.println(hs.contains(20));
		
		System.out.println(hs.remove(52));
		System.out.println(hs);
		
		System.out.println("size of hashset: "+hs.size());
		System.out.println(hs);
		
		if(hs.isEmpty()) {
			System.out.println("List Empty");
		}
		else {
			System.out.println("list is not empty");
		}
		
		System.out.println(hs);
	}
	

}
