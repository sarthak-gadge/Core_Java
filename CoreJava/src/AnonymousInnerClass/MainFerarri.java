package AnonymousInnerClass;

public class MainFerarri {

	public static void main(String[] args) {

		Ferrari f = new Ferrari() {

			public void drive() {
				System.out.println("anonymous Class");
			}
		};
		
		 f.drive();	}

}  
