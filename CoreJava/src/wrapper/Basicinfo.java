package wrapper;

public class Basicinfo {
	
//	primitive to Wrapper
	int x=30;
	Integer i = new Integer(x);
	
	
//	Wrapper TO Primitive
	Integer obj = new Integer(100);
	int y = obj.intValue();
	
	
//	String TO Primitive 
	String s = "30";
	int j = Integer.parseInt(s);
	
	
//	String To Wrapper
	String s1 = "30.6667";
	Double k = Double.valueOf(s); 
	
	
	
//	primitive type of info converted into (object type)wrapper type called autoboxing.
	
//	object type of information converted into wrapper(primitive)type of info called autounboxing.
	
//	all java primitive have counterparts called wrapper classes.
	
	
	

}
