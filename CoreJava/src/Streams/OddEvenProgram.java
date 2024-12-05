package Streams;

import java.util.ArrayList;

public class OddEvenProgram {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> Number = new ArrayList<Integer>();
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		
		for(int i=0;i<=30;i++) {
			Number.add(i);
		}
		
		System.out.println("Numbers: "+Number);
		
		for(Integer number:Number) 
		{
			if(number%2==0) {
				evenNumbers.add(number);
			}
		}
	     System.out.println("even numbers: "+evenNumbers);	
	}
}




