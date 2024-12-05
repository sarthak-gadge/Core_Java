package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreammApi {
//	using on odd even program.
	public static void main(String[] args) {
		
		List<Integer>list = Arrays.asList(11,12,13,14,15,16,17,18,19,20);
		
		Stream<Integer>stream = list.stream();
		
//		convert list into stream
		List<Integer>evenlist = stream.filter(i->i%2==0).collect(Collectors.toList());
		
		for(Integer i:evenlist) {
			System.out.println(i);
		}
	}

}
