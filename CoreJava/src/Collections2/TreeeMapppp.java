package Collections2;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeeMapppp {

//	alphabetically sorted keys.
	
	public static void main(String[] args) {
		
		Map<String,Long> phoneDirectory = new TreeMap<String,Long>();
		
		phoneDirectory.put("Sarthak",9630258741l);
		phoneDirectory.put("Om",1478523690l);
		phoneDirectory.put("Amar",1234659873l);
		phoneDirectory.put("Prasad",7894561230l);
		phoneDirectory.put("Sanket",5256487568l);
		phoneDirectory.put("Ravi",9579290571l);
		
		System.out.println(phoneDirectory.keySet());
		System.out.println("========================================================");
		
		System.out.println(phoneDirectory.containsKey("Ravi"));
		System.out.println("=========================================================");
		
		System.out.println("Contach no of Sanket: "+phoneDirectory.get("Sanket"));
		System.out.println("==============================================================");
		
		
		for(Entry<String,Long> entry:phoneDirectory.entrySet()) {
			System.out.println(entry);
		}
		
	}

}
