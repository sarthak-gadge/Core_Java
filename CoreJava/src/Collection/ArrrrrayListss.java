package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrrrrayListss {
		
		public static void main(String[] args) {
			
			List list = new ArrayList();
			
			list.add(45);
			list.add(87.45);
			list.add(76);
			list.add("Sarthak");
			list.add(45.2);
			
			Iterator itr = list.iterator();
		
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}	
			
//			for(Object ob:list) {
//				System.out.println(ob);
//			}
		}
	}


