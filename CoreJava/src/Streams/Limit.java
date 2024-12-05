package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit {
	
	public static void main(String[] args) {
		
		List<Integer> numlist = Arrays.asList(11,75,72,13,18,18,14,14,19,19,23,23,28,28);
		
//		convert list into stream
		List<Integer> limitalist = numlist.stream().limit(12).collect(Collectors.toList());
		
		for(Integer i:limitalist) {
			System.out.println(i);
		}
	}

}
