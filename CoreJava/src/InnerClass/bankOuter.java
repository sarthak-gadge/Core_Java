package InnerClass;

public class bankOuter {
	 private int accNo;
	 private String accHolderName;
	 
	 
	public bankOuter() {
	   accNo = 6037252;
	   accHolderName = "sarthak gadge";
	}
	
	public void Print() {
		System.out.println("Account details:");
		System.out.println("Account no: "+accNo);
		System.out.println("Account Type: "+accHolderName);	
	}
	
	class LockerInner{
		
		private int lockerNo;
		private int lockerPassword;
		
		
		public LockerInner() {
	        lockerNo = 245;
			lockerPassword = 235687;
		}
		
		public void PrintInfo() {
			System.out.println("Locker details:");
			System.out.println("Locker Number: "+lockerNo);
			System.out.println("Locker Password: "+lockerPassword);
		
	}	 
	}
	}