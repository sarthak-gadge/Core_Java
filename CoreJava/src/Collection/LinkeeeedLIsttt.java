package Collection;

import java.util.Collections;

//List :-- 2.LinkedList.


import java.util.LinkedList;
import java.util.List;

public class LinkeeeedLIsttt {
	
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("japan");
		list.add("canada");
		list.add("South Africa");
		list.addFirst("australia");
		list.addLast("nepal");
		
		
		for(String str:list) {
			System.out.println(str);
		}
		
		System.out.println(list);
		
		System.out.println("==============================");
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
	}

}
