package String;

public class StringClass {
	
	String s1 = "hello";
	String s2 = "World";
	String s3 = "WORLD";
	
	public void printInfo() {
		System.out.println(s1.concat(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.replace("o", "w"));
		
		System.out.println(s1.contains("hel"));
		System.out.println(s1.length());
		System.out.println(s2.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s2.replaceAll(s1, s3));
	}
	
	
	public static void main(String[] args) {
		
		StringClass obj = new StringClass();
		obj.printInfo();
		
	}

}
