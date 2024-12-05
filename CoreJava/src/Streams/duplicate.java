package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class duplicate {
	
	public static void main(String[] args) {
		
		List<Integer> numlist = Arrays.asList(11,11,13,17,15,13,18,18,21,13,17,15);
		
//		convert list into stream
		List<Integer> duplicatealist = numlist.stream().distinct().collect(Collectors.toList());
		
		for(Integer i:duplicatealist) {
			System.out.println(i);
		}
	}

}
