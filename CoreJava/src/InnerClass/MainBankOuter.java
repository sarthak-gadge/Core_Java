package InnerClass;

public class MainBankOuter {
	
	public static void main(String[] args) {
		
		bankOuter b = new bankOuter();
		b.Print();
		
		bankOuter.LockerInner l = b.new LockerInner();
		l.PrintInfo();
	}

}
