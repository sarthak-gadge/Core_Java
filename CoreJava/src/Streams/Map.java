package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
	
	public static void main(String[] args) {
		
		List<Integer> numlist = Arrays.asList(11,20,3,41,52);
		
//		convert list into stream
		List<Integer>mappalist = numlist.stream().map(i->i*i).collect(Collectors.toList());
		
		for(Integer i:mappalist) {
			System.out.println(i);
		}
		
	}

}
